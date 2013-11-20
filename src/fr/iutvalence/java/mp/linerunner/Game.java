package fr.iutvalence.java.mp.linerunner;

/**
 * this class is one gameplay whose rules are in the README file.
 * 
 */
public class Game
{
    
    /**
     * declaration of row's number
     */
    public static final int ROWS = 5;

    /**
     * declaration of column's number
     */
    public static final int COLUMNS = 10;
    
    
    // TODO (fixed) rewrite comment
    /**
     * an object who represent the character in the game
     * 
     */
    private Element player1;
    
    /**
     * create a variable who contain the object who can display the game
     */
    private Grid grid;

    /**
     * once created we've got a character on the screen and the player will jump or creep behind hurdles
     * constructors who create a new grid for each new game and make a scroll of
     * this grid
     */
    public Game()
    {
        this.player1 = new Element(ROWS-3,2,2);
        this.grid = new Grid();  
    }
    
    /**
     * 
     */
    public void play()
    {
        // TODO (fixed) rename variable
        boolean Game_over = false;
        
        // TODO (fixed) simplify test
        while (!Game_over)
        {
          System.out.print(this + "\n");
            
            
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
            this.scrolling();
            

            if (this.player1.moveUp())
            {

            }

        }
        
    }
    

/**
 * @see java.lang.Object#toString()
 */
public String toString()
{
    boolean caracters=false;
    String result = "";

    for (int i = 0; i < ROWS; i++)
    {
        for (int j = 0; j < COLUMNS; j++)
        {
            
            if (i==this.player1.getPosition().getX() && j== this.player1.getPosition().getY())
            {
                result += 3;
                caracters=false;
            }
            else
            {
                result += this.grid.grid[j][i];
            }
            
        }
        result += "\n";
    }

    return result;
}
    
   

    /**
     * method that makes the grid scrolling
     * 
     * @return true if the character will die
     */

    // TODO (fixed) this method should be private
   
    private boolean scrolling()
    {
        // TODO (fixed) use int instead of Integer
        final int x_hurdle = 9;
        final int y_hurdle = 3;
        
        boolean game_over = false;

        for (int Y = 0; Y < COLUMNS - 1; Y++)
        {
            for (int X = 0; X < ROWS; X++)
            {
                    this.grid.grid[Y][X] = this.grid.grid[Y + 1][X];
            }
            this.grid.grid[Y][ROWS - 1] = 4;
        }
        return game_over;
    }     

        

}

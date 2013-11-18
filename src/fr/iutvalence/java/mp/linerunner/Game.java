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
     * declaration of one variable who contain one object player
     * (it will be like a joy-stick)
     */
    private Element player1;
    
    
    /**
     * create a variable who contain the object who can display the game
     */
    private Grid grid;

    // TODO (fixed) detail comment (how is the game once created?)
    // TODO (fix) this constructor should only initialize a game, not play it
    // move the code that plays the game is a method called "play"
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
        boolean i = false;
        

        while (i == false)
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
 * @param joueur 
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

    // TODO (fix) this method is game-related and should be moved to Game
   
    public boolean scrolling()
    {
        final Integer x_hurdle = 9;
        final Integer y_hurdle = 3;
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
        
        /**
         * // TODO (fixed) do not use hard-coded values but constants

        if (this.grid.grid[x_hurdle - 1][y_hurdle] != this.grid.getHurdle())
        {
            this.grid.grid[x_hurdle][y_hurdle] = HURDLE;
        }

        for (int Y = 0; Y < COLUMNS - 1; Y++)
        {
            for (int X = 0; X < ROWS; X++)
            {
                if (this.grid[Y + 1][X] != CHARACTER && this.grid[Y][X] != CHARACTER)
                {
                    this.grid[Y][X] = this.grid[Y + 1][X];
                }

            }
            this.grid[Y][ROWS - 1] = GROUND;
        }
        if (this.grid[2][ROWS - 1] == HOLE && this.grid[2][ROWS - 2] == CHARACTER)
        {
            game_over = true;
        }

        this.grid[x_hurdle][y_hurdle] = NOTHING;
        return game_over;
         **/
    
    /**
     * this method allow to insert a new obstacle in the grid with a random position
     */
    public void obstacle()
    {
        
    }
    
        

}

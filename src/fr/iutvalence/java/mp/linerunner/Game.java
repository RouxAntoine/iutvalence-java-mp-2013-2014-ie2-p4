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
    
    /**
     * its the size of the table who contain all the hurdle at the time "t", "10" is the number of columns
     */
    public static final int SIZE_TAB_HURDLE=10;
    
    
    // TODO (fixed) rewrite comment
    /**
     * declaration of one variable who contain one object player
     * (it will be like a joy-stick)
     */
    private Element player1;
    
    /**
     * {@link Tab_hurdle} a table who contain all the element on the grid
     */
    private Tab_hurdle tab_hurdle1;
    
    /**
     * create a variable who contain the object who can display the game
     */
    private Display screen;

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
        this.player1 = new Element(2,3,2);
        this.tab_hurdle1 = new Tab_hurdle(SIZE_TAB_HURDLE);
        this.screen = new Display(this.tab_hurdle1);
        
        boolean i = false;


        while (i == false)
        {
            System.out.println(this.screen.toString());
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
            
            

            if (this.player1.moveUp())
            {

            }

        }

    }
    


 
    
/*

    /**
     * method that makes the grid scrolling
     * 
     * @return true if the character will die
     //
    // TODO (fix) this method is game-related and should be moved to Game
    public boolean scrolling()
    {
        final Integer x_hurdle = 9;
        final Integer y_hurdle = 3;
        boolean game_over = false;

        // TODO (fixed) do not use hard-coded values but constants

        if (this.grid.[x_hurdle - 1][y_hurdle] != this.grid.getHurdle())
        {
            this.grid[x_hurdle][y_hurdle] = HURDLE;
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

    }
    */

}

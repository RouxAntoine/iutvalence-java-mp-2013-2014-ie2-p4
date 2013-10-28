package fr.iutvalence.java.mp.linerunner;

/**
 * 
 * @author rouxan the class who containt the grid for the game
 */

public class Grid
{
    /**
     * declaration of row's number
     */
    private static final int ROWS = 5;

    /**
     * declaration of a hole number in the ground
     */
    private static final int HOLE = 0;

    /**
     * declaration of column's number
     */
    private static final int COLUMNS = 10;

    /**
     * number which represent the character in the grid
     */
    private static final int CHARACTER = 3;

    /**
     * number which represent the free space in the grid
     */

    private static final int NOTHING = 1; // identification of void space on the
                                          // grid

    /**
     * number which represent hurdles in the grid
     */
    private static final int HURDLE = 2; // identification of the high_hurdle on
                                         // the grid

    /**
     * number which represent the ground in the grid
     */
    private static final int GROUND = 4;
    
    /**
     * grid's declaration who is a area who contain many numbers who correspond
     * to a hurdle, character and void
     */
    private int[][] grid;

    // TODO (fix) detail comment (how is the grid once created?)
    /**
     * constructor of one grid size ROWS*COLUMNS
     */
    public Grid()
    {
        this.grid = new int[COLUMNS][ROWS];

        for (int Y = 0; Y < COLUMNS; Y++)
        {
            for (int X = 0; X < ROWS; X++)
            {
                this.grid[Y][X] = 1;
            }
            this.grid[Y][ROWS - 1] = 4;
        }
        this.grid[2][ROWS - 3] = CHARACTER;
        this.grid[2][ROWS - 2] = CHARACTER;

    }

    /**
     * define a value in the grid at [x;y]
     * 
     * @param x
     *            value in abscissa
     * @param y
     *            value in ordered
     * @param element
     *            that you want assign to the compartment in x,y
     */
    // TODO (fix) gather the two coordinates is a single object
    public void setElementAt(int x, int y, int element)
    {
        this.grid[x][y] = element;
    }

    /**
     * allows to know values in the grid in [x;y]
     * 
     * @param x
     *            value in abscissa
     * @param y
     *            value in ordered
     * @return return the value of the compartment x,y
     * 
     */
    public int getElementAt(int x, int y)
    {
        return this.grid[x][y];
    }

    /**
     * method that makes the grid scrolling
     * 
     * @return true if the character will die
     */
    // TODO (fix) this method is game-relatd and should be moved to Game
    public boolean scrolling()
    {
        final Integer x_hurdle = 9;
        final Integer y_hurdle = 3;
        boolean game_over = false;

        // TODO (fixed) do not use hard-coded values but constants

        if (this.grid[x_hurdle - 1][y_hurdle] != HURDLE)
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

    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String result = "";

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                result += this.grid[j][i];
            }
            result += "\n";
        }

        return result;

    }

}
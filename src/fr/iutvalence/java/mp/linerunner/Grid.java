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

    // TODO (fix) rewrite comment. Do not say that you declare a grid (it is self-contained) but say 
    // what is the grid
    /**
     * grid's declaration
     */
    private int[][] grid;

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
        this.grid[2][ROWS - 3] = 3;
        this.grid[2][ROWS - 2] = 3;

    }

    /**
     * define a value in the grid at [x;y]
     * 
     * @param x
     *            value in abscissa
     * @param y
     *            value in ordered
     * @param value
     *            that you want assign to the compartment in x,y
     */
    public void defineCompartment(int x, int y, int value)
    {
        this.grid[x][y] = value;
    }

    /**
     * allow to know values in the grid in [x;y]
     * 
     * @param x
     *            value in abscissa
     * @param y
     *            value in ordered
     * @return return the value of the compartment x,y
     * 
     */
    public int recoverCompartment(int x, int y)
    {
        return this.grid[x][y];
    }

    /**
     * method that makes the grid scrolling
     */
    public void scrolling()
    {
        // TODO (fix) do not use hard-coded values but constants
        if (this.grid[8][3] != 2)
        {
            this.grid[9][3] = 2;
        }
        for (int Y = 0; Y < COLUMNS - 1; Y++)
        {
            for (int X = 0; X < ROWS; X++)
            {
                if (this.grid[Y + 1][X] != 3 && this.grid[Y][X] != 3)
                {
                    this.grid[Y][X] = this.grid[Y + 1][X];
                }
                else if (this.grid[Y + 1][X] == 2 && this.grid[Y][X] == 3)
                {
                    /*
                     * while (1) { try{ Thread.sleep(1000);
                     * }catch(InterruptedException e){}
                     * System.out.print("game over!"); if (appuie sur le touche
                     * ) { wend; } }
                     * 
                     * 
                     * en cour ....
                     */
                }

            }
            this.grid[Y][ROWS - 1] = 4;
        }
        this.grid[9][3] = 1;

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
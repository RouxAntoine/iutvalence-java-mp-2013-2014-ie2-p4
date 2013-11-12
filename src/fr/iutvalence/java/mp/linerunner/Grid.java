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
     * grid's declaration who is a area who contain many numbers who correspond
     * to a hurdle, character and void
     */
    public int[][] grid;

    // TODO (fixed) detail comment (how is the grid once created?)
    /**
     * once created we've got a character on the screen and the player will jump or creep behind hurdles
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
        this.grid[5][3]=8;
    }


    
}
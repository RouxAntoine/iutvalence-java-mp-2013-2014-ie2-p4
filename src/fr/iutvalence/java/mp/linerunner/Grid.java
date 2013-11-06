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

    // TODO (fixed) detail comment (how is the grid once created?)
    /**
     * once created we've got a character on the screen and the player will jump or creep behind hurdles
     * constructor of one grid size ROWS*COLUMNS
     */
    public Grid()
    {
        this.setGrid(new int[COLUMNS][ROWS]);

        for (int Y = 0; Y < COLUMNS; Y++)
        {
            for (int X = 0; X < ROWS; X++)
            {
                this.getGrid()[Y][X] = 1;
            }
            this.getGrid()[Y][ROWS - 1] = 4;
        }
        this.getGrid()[2][ROWS - 3] = CHARACTER;
        this.getGrid()[2][ROWS - 2] = CHARACTER;
    }

    // TODO (fixed) gather the two coordinates is a single object
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
    public void setElementAt(Position p,  int element)
    {
     
    }

    
    /**
     * allows to know values in the grid in [x;y]
     * 
     * @param x
     *            value in abscissa
     * @param y
     *            value in ordered
     * @return 
     * @return return the value of the compartment x,y
     * 
     */
    public int[] getElementAt(Position p)
    {
        return resultat;
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
                result += this.getGrid()[j][i];
            }
            result += "\n";
        }

        return result;

    }


    /**
    * method who return the value who check to an hurdle on the grid
    */
    public int getHurdle()
    {
        return HURDLE;
    }

}
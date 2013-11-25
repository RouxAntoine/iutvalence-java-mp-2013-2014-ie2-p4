package fr.iutvalence.java.mp.linerunner;
import java.util.Random;


/**
 * 
 * @author rouxan the class who containt the grid for the game
 */

public class Grid
{
    /**
     * variable who represent the ground in the grid
     */
    private static final int GROUND=4;
    
    /**
     * variable who represent a void area in the grid
     */
    private static final int EMPTY=1;
    
    /**
     * variable who represent a void area in the grid
     */
    private static final int HURDLE=8;
    
    /**
     * grid's declaration who is a area who contain many numbers who correspond
     * to a hurdle, character and void
     */
    public int[][] grid;

    /**
     * once created we've got a character on the screen and the player will jump or creep behind hurdles
     * constructor of one grid size ROWS*COLUMNS
     */
    public Grid()
    {
        this.grid = new int[Game.COLUMNS][Game.ROWS];

        for (int Y = 0; Y < Game.COLUMNS; Y++)
        {
            for (int X = 0; X < Game.ROWS; X++)
            {
                this.grid[Y][X] = EMPTY;
            }
            this.grid[Y][Game.ROWS - 1] = GROUND;
        }
    }
    
    
    
    /**
     * this method allow to insert a new obstacle in the grid with a random position
     * @return return an element with a random position
     */
    public void obstacle()
    {
        
        int randx=Game.COLUMNS-2;
        int randy=0;
        
        randy=new Random().nextInt(4);
        
        this.grid[randx][randy] = HURDLE;
    }
   
    /**
     * @return constant value of the hurdle case
     */
    public int getHurdle()
    {
        return HURDLE;
    }
    
    /**
     * @return constant value of the empty case
     */
    public int getEmpty()
    {
        return EMPTY;
    }
    
}
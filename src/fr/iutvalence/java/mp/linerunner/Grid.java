package fr.iutvalence.java.mp.linerunner;

import java.lang.invoke.ConstantCallSite;
 /**
  * 
  * @author rouxan
  * the class who containt the grid for the game
  */

public class Grid
{
    // TODO (fixed) declare field visibility
    // TODO (fixed) rename field
    private static final int ROWS=5;
    
    // TODO (fixed) declare field visibility
    // TODO (fixed) rename field
    private static final int COLUMNS=10;
    
    // TODO (fixed) initialize field in constructor, not here    
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int CHARACTER=3;               //identification of the characters on the grid
 
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int LOWHURDLE=0;               //identification of the low_hurdle on the grid
    
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int NOTHING=1;                  //identification of void space on the grid
    
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int HIGHHURDLE=2;             //identification of the high_hurdle on the grid
    
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int GROUND=4;                   //identification of the ground on the grid
        
    private int[][] GRID;
    
    
    // TODO (fixed) write a comment
    
    /**
     * constructor of one grid size ROWS*COLUMNS
     */
    public Grid()
    {
        this.GRID = new int[COLUMNS][ROWS];
        
        
        for(int Y=0; Y<=ROWS;Y++)
        {
            for(int X=0;X<COLUMNS;X++)
            {
                this.GRID[X][Y]=1;
            }
            this.GRID[COLUMNS][Y]=4;
        }
        
    }
    
    /**
     * 
     * @param x value in abscissa
     * @param y value in ordered
     * @param value that you want assign to the compartment in x,y
     */
    public void DefineCompartment(int x, int y, int value)
    {
        this.GRID[x][y]=value;
    }
    
    /**
     * 
     * @param x value in abscissa
     * @param y value in ordered
     * @return return the value of the compartment x,y
     */
    public int RecoverCompartment(int x, int y)
    {
        return this.GRID[x][y];
    }
    
}
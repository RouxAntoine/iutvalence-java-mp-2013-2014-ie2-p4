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
    private int row;
    
    // TODO (fixed) declare field visibility
    // TODO (fixed) rename field
    private int column;
    
    // TODO (fixed) initialize field in constructor, not here    
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int Character=3;               //identification of the characters on the grid
 
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int LowHurdle=0;               //identification of the low_hurdle on the grid
    
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int Nothing=1;                  //identification of void space on the grid
    
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int HighHurdle=2;             //identification of the high_hurdle on the grid
    
    // TODO (fixed) initialize field in constructor, not here
    // TODO (fixed) if it is supposed to be a constant, declare it as a constant
    private static final int Ground=4;                   //identification of the ground on the grid
        
    // TODO (fixed) write a comment
    
    /**
     * declaratuion of the size of the grid
     */
    public Grid()
    {
        int[][]t= new int [10][5];        
    }

}

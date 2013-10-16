package fr.iutvalence.java.mp.linerunner;

 /**
  * 
  * @author rouxan
  * the class who containt the grid for the game
  */

public class Grid
{
    // TODO (fix) write "Javadoc" comment
    private static final int ROWS=5;

    // TODO (fix) write "Javadoc" comment
    private static final int COLUMNS=10;
    
    // TODO (fix) write "Javadoc" comment
    private static final int CHARACTER=3;             
    
    // TODO (fix) write "Javadoc" comment
    private static final int NOTHING=1;                  //identification of void space on the grid
    
    // TODO (fix) write "Javadoc" comment
    private static final int HURDLE=2;             //identification of the high_hurdle on the grid
    
    // TODO (fix) write "Javadoc" comment
    private static final int GROUND=4;                   //identification of the ground on the grid
        
    // TODO (fix) write comment
    // TODO (fix) comply with naming conventions
    private int[][] GRID;
    
    
    /**
     * constructor of one grid size ROWS*COLUMNS
     */
    public Grid()
    {
        this.GRID = new int[COLUMNS][ROWS];
        
        
        for(int Y=0;Y<COLUMNS;Y++)
        {
            for(int X=0; X<ROWS;X++)  
            {
                this.GRID[Y][X]=1;
            }
            this.GRID[Y][ROWS-1]=4;
        }
        this.GRID[2][ROWS-3]=3;
        this.GRID[2][ROWS-2]=3;
        
    }
    
    // TODO (fix) finish writing comment
    // TODO (fix) comply with naming conventions
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
    
    // TODO (fix) finish writing comment
    // TODO (fix) comply with naming conventions
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
     
    // TODO (fix) comply with naming conventions
    /**
     *method who allow the grid scrolling  
     */
    public void Scrolling()
    {
        
        for(int Y=0;Y<COLUMNS-1;Y++)
        {
            for(int X=0; X<ROWS;X++)
            {
                if (this.GRID[Y+1][X]!=3 && this.GRID[Y][X]!=3)
                {
                    this.GRID[Y][X]=this.GRID[Y+1][X];
                }
                
            }
            this.GRID[Y][ROWS-1]=4;
        }
        
    }

    // TODO (fix) write comment
    @Override
    public String toString()
    {
        String result="";
        
        for (int i=0;i<ROWS;i++)
        {
            for (int j=0;j<COLUMNS;j++)
            {
               result+=this.GRID[j][i]; 
            }
            result+="\n";
        }       
               
        return result;
        
    }
    
    
    
}
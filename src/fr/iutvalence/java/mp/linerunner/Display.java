package fr.iutvalence.java.mp.linerunner;

/**
 * @author rouxan
 *class who allow to display all th element on one grid ( display the hurles the characters and the floors)
 */
public class Display
{
    
    /**
     *  screen is a table who represent the screen with many number for represent the hurdle and the character
     */
    private int[][] screen;
    
    /**
     * constructors
     * @param Hurdles the table who contain all the hurdle
     */
    public Display(TabHurdle Hurdles)
    {
        this.screen=new int [Game.ROWS][Game.COLUMNS];
        
        for(int j=0;j< Game.COLUMNS;j++)
        {
            for(int i=0;i< Game.ROWS;i++)
            {
                if (i==Game.ROWS-1)
                {
                    this.screen[i][j]=4;
                }
                else
                {
                    this.screen[i][j]=1;
                }
            }
        }
        
    }

    
    public String toString()
    {
        String result = "";

        for (int i = 0; i < Game.ROWS; i++)
        {
            for (int j = 0; j < Game.COLUMNS; j++)
            {
                System.out.print(this.screen[i][j]);
            }
            System.out.print("\n");
        }

        return result;
    }

}

package fr.iutvalence.java.mp.linerunner;

/**
 * @author rouxan
 *class who allow to display all th element on one grid ( display the hurles the characters and the floors)
 */
public class Display
{

    /**
     * constructors
     * @param  
     * @param Hurdles the table who contain all the hurdle
     */

    public void affiche(Grid grid , Element player1)
    {
        boolean caracters=false;
        
        for (int i = 0; i < Game.ROWS; i++)
        {
            for (int j = 0; j < Game.COLUMNS; j++)
            {
                
                if (i==player1.getPosition().getX() && j== player1.getPosition().getY())
                {
                    System.out.print("3");
                    caracters=false;
                }
                else
                {
                    System.out.print(grid.grid[j][i]);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
    }

}
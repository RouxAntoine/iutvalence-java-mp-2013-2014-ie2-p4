package fr.iutvalence.java.mp.linerunner;

/**
 * this class is one gameplay whose rules are in the README file.
 * 
 */
public class Game
{
    // TODO (fixed) rewrite comment
    /**
     * creation of one variable of type grid who receive the grid return by the class grid
     */
    private Grid grid;
    /**
     * creation of one new player who simulate the jump 
     */
    private Player player1;

    // TODO (fixed) detail comment
    /**
     * constructors who create a new grid for each new game and make a scroll of this grid
     */
    public Game()
    {
        this.grid = new Grid();
        this.player1= new Player();
        
        boolean i = false;
        
        System.out.println(this.grid);

        while (i == false)
        {
            i=this.grid.scrolling();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
            }
            System.out.println(this.grid);
            
            
            if (this.player1.jump())
            {
                
            }
            
        }

    }

    /**
     * methods
     */

}

package fr.iutvalence.java.mp.linerunner;

/**
 * this class is one gameplay whose rules are in the README file.
 * 
 */
public class Game
{
    // TODO (fix) rewrite comment
    /**
     * arguments new grid's creation
     */
    private Grid grid;

    // TODO (fix) detail comment
    /**
     * constructors
     */
    public Game()
    {
        this.grid = new Grid();
        int i = 1;
        System.out.println(this.grid);

        while (i == 1)
        {
            this.grid.scrolling();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
            }
            System.out.println(this.grid);
        }

    }

    /**
     * methods
     */

}

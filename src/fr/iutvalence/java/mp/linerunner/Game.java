package fr.iutvalence.java.mp.linerunner;

/**
 * this class is one gameplay whose rules are in the README file.
 * 
 */
public class Game
{
    // TODO (fix) rewrite comment
    // The aim of the comment is not to say that something is declared but to say what it is
    // with regards to the application
    /**
     * creation of one variable of type grid who receive the grid return by the
     * class grid
     */
    private Grid grid;
    
    // TODO (fix) rewrite comment
    /**
     * creation of one new player who simulate the jump
     */
    private Player player1;

    // TODO (fix) detail comment (how is the game once created?)
    // TODO (fix) this constructor should only initialize a game, not play it
    // move the code that plays the game is a method called "play"
    /**
     * constructors who create a new grid for each new game and make a scroll of
     * this grid
     */
    public Game()
    {
        this.grid = new Grid();
        this.player1 = new Player();

        boolean i = false;

        System.out.println(this.grid);

        while (i == false)
        {
            i = this.grid.scrolling();
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

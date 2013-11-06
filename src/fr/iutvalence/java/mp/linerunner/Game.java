package fr.iutvalence.java.mp.linerunner;

import java.util.Random;

/**
 * this class is one gameplay whose rules are in the README file.
 * 
 */
public class Game
{
    // TODO (fixed) rewrite comment
    // The aim of the comment is not to say that something is declared but to say what it is
    // with regards to the application
    /**
     * Creation of one variable of type grid who receive the grid return by the
     * class grid. The aim of this grid is to realize an interface for the player. 
     */
    private Grid grid;
    
    // TODO (fixed) rewrite comment
    /**
     * declaration of one variable who contain one object player
     * (it will be like a joy-stick)
     */
    private Player player1;

    // TODO (fixed) detail comment (how is the game once created?)
    // TODO (fix) this constructor should only initialize a game, not play it
    // move the code that plays the game is a method called "play"
    /**
     * once created we've got a character on the screen and the player will jump or creep behind hurdles
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

            if (this.player1.moveUp())
            {

            }

        }

    }
    


    /**
     * method that makes the grid scrolling
     * 
     * @return true if the character will die
     */
    // TODO (fix) this method is game-related and should be moved to Game
    public boolean scrolling()
    {
        final Integer x_hurdle = 9;
        final Integer y_hurdle = 3;
        boolean game_over = false;

        // TODO (fixed) do not use hard-coded values but constants

        if (this.grid.getGrid()[x_hurdle - 1][y_hurdle] != this.grid.getHurdle())
        {
            this.grid[x_hurdle][y_hurdle] = HURDLE;
        }

        for (int Y = 0; Y < COLUMNS - 1; Y++)
        {
            for (int X = 0; X < ROWS; X++)
            {
                if (this.grid[Y + 1][X] != CHARACTER && this.grid[Y][X] != CHARACTER)
                {
                    this.grid[Y][X] = this.grid[Y + 1][X];
                }

            }
            this.grid[Y][ROWS - 1] = GROUND;
        }
        if (this.grid[2][ROWS - 1] == HOLE && this.grid[2][ROWS - 2] == CHARACTER)
        {
            game_over = true;
        }

        this.grid[x_hurdle][y_hurdle] = NOTHING;
        return game_over;

    }
    

    /**
     * methods
     */

}

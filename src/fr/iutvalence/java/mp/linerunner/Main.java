package fr.iutvalence.java.mp.linerunner;

/**
 * Default game launcher
 */

public class Main
{
    
    /**
     * size of the windows will be define after
     */
    private int width=0;
    private int height=0;
      
    /**
     * main of the program that contains the creation of the game
     * 
     * @param args
     *            no arguments expected
     * 
     */
    public static void main(String[] args)
    {
        Game currentGame;
        currentGame = new Game();
        currentGame.play();

        
    }
}
package fr.iutvalence.java.mp.linerunner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Default game launcher
 */

public class Main extends JFrame
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
        
        JFrame fenetre = new JFrame();
        fenetre.setSize(0, 0);
        fenetre.setResizable(false);
        fenetre.setVisible(true);
        fenetre.addKeyListener(null);
        currentGame.play();
        fenetre.dispose();
        
    }
}

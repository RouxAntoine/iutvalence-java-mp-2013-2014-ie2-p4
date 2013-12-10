package fr.iutvalence.java.mp.linerunner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class Mover implements KeyListener
{
    
    private JFrame fenetre;
    
    private volatile boolean isjump;
    
    public Mover()
    {
        this.fenetre = new JFrame();
        
        this.fenetre.setSize(0, 0);
        this.fenetre.setResizable(false);
        this.fenetre.setVisible(true);
        this.fenetre.addKeyListener(this);
    }
    /**
     * this method return true if the player want to jump and false if he
     * doesn't want
     * 
     * @return a Boolean
     */
    public boolean moveUp()
    {
        this.isjump = false;
        
        try
        {
            Thread.sleep(750);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return isjump;
    }
    
               
        @Override
        public void keyPressed(KeyEvent arg0){}
        
        @Override
        public void keyReleased(KeyEvent arg0){}
        
        @Override
        public void keyTyped(KeyEvent touche)
        {
                // TODO Auto-generated method stub
                if(touche.getKeyCode()==KeyEvent.VK_SPACE)
                {
                    
                    System.out.print("touche appuyée");
                }
                isjump = true;
        }
        
        
        public void stopFenetre()
        {
            this.fenetre.dispose();
        }
}

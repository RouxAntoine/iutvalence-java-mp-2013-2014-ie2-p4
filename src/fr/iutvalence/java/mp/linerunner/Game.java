package fr.iutvalence.java.mp.linerunner;

// TODO (fixed) write a "real" comment
/**
 * this class is one gameplay the rules is in the README file.
 * 
 */


public class Game
{
    /**
     * arguments
     * new grid's creation
     */
    private Grid grid;   
    
    
    /**
     * constructors
     */
    public Game()
    {
        this.grid = new Grid();
        int i=1;
        System.out.println(this.grid);
        
        
        while(i==1)
        {
            this.grid.Scrolling();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            System.out.println(this.grid);
        }
         
    }
    
    /**
     * methods
     */

    
}

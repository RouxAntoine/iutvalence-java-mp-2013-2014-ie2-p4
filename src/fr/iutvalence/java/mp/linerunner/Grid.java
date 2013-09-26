package fr.iutvalence.java.mp.linerunner;
 /**
  * 
  * @author rouxan
  * the class who containt the grid for the game
  */

public class Grid
{
    int ligne;
    int colonne;
    
    private int character=3 ;               //identification of the characters on the grid
    private int low_hurdle=0;               //identification of the low_hurdle on the grid
    private int nothing=1;                  //identification of void space on the grid
    private int high_hurdle=2;             //identification of the high_hurdle on the grid
    private int ground=4;                   //identification of the ground on the grid
        
    public Grid()
    {
    /**
     * @param void
     */
        int[][]t= new int [10][5];        
    }

}

package fr.iutvalence.java.mp.linerunner;

import java.util.Random;

/**
 * @author rouxan
 *
 */
public class TabHurdle
{
    
 /**
 * define one table of element
 */
private Element[] tab;
    
// TODO (fix) this class seems to be unused, so remove it
 /**
 * @param size of the tab of Element
 * constructor who create the table who contain 10 element
 */
 public TabHurdle(int size)
 {
     this.tab=new Element[size];
     
     for(int i = 0; i <= size-1;i++)
     {
        // this.tab[i]=1;
     }
 }
 
 /**
  * add one line who contain the random hurdle
  */
 public void addline()
 {
         int valeur = new Random().nextInt(4);
         //this.tab[i]= new Element(Game.COLUMNS, valeur);
 }

}

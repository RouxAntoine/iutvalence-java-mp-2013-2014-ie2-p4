package fr.iutvalence.java.mp.linerunner;

import java.util.Random;


/**
 * 
 * @author rouxan vignandc
 * class who simulate one player
 */
public class Player
{
  
    /**
     * this method return true if the player want to jump and false if he doesn't want
     * @return a Boolean
     */
    public boolean jump()
    {
        boolean isjump=false;
        
        int valeur = new Random().nextInt(4);
       
        if (valeur==0)
        {
            isjump=true;
        }   
        System.out.print("\n"+valeur+"\n");
        
        
        return isjump;
    }
}

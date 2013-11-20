package fr.iutvalence.java.mp.linerunner;

import java.util.Random;


/**
 * class who simulate one player
 * 
 * @author rouxan vignandc 
 */
public class Element
{

    /**
     * value who contains one position qualified by a ordonna and abscissa
     */
    private Position position;
    
    /**
     * the height of the element in the grid
     */
    private int height;
    
    /**
     * height by default of one element
     */
    private final static int DEFAULT_HEIGHT=1;

    
    /***
     * 
     * @param x0 value in Orderly
     * @param y0 value in abscissa
     * constructor by default without to take account of the element's size (default size is one)
     */
    public Element(int x0,int y0)
    {
        this.position = new Position(x0,y0);
        this.height =DEFAULT_HEIGHT;
    }

    // TODO (fixed) finish writing comment
    /**
     * @return the value in Orderly and abscissa of the element concerned
     * method who return the position of the current element
     */
    public Position getPosition()
    {
        return this.position;
    }
    
    /**
     * @param x the value in abscissa witch will be attributed at the element
     * @param y the value in ordonna witch will be attributed at the element
     */
    public void setPosition(int x, int y)
    {
        this.position.setX(x);
        this.position.setY(y);
    }
    
    /**
     * this method return true if the player want to jump and false if he
     * doesn't want
     * 
     * @return a Boolean
     */
    public boolean moveUp()
    {
        boolean isjump = false;

        int valeur = new Random().nextInt(4);

        if (valeur == 0)
        {
            isjump = true;
        }

        return isjump;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
     public String toString()
     {
         String result = "";
     
         result += "("+this.position.getX()+","+this.position.getY()+")";
         
         return result;
     }
    
}

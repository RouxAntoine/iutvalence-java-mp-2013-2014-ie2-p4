package fr.iutvalence.java.mp.linerunner;

/**
 * @author rouxan
 * a class who represent one point on the grid and is composed of on integer X and one other integer Y
 */
public class Position
{
    /**
     * coordinate in abscissa
     */
    private final int x;
    
    /**
     * coordinate in orderly
     */
    private final int y;
    
    /**
     * @param x0 value witch initialize x
     * @param y0 value witch initialize y
     */
    public Position(int x0, int y0)
    {
        this.x=x0;
        this.y=y0;
    }

    /**
     * @return the value of x
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * @return the value of y
     */
    public int getY()
    {
        return this.y;
    }
    
    
}

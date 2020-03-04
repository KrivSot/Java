
/*******************************************************************************
 * Instance třídy {@code Primka} představují ...
 * The {@code Primka} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Bod implements IBod 
{
    /***************************************************************************
     */
    protected IBod bod;
    int x = 50;
    int y = 50;
    public Bod(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int getBodX1()
    {
        return this.x;
    }
    
    @Override
    public int getBodX2()
    {
        return this.x;
    }
    
    @Override
    public int getBodY1()
    {
        return this.y;
    }
    
    @Override
    public int getBodY2()
    {
        return this.y;
    }
    
    @Override
    public void setX1aY1(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void setX2aY2(int x,int y)
    {
        setX1aY1(x,y);
    }
}
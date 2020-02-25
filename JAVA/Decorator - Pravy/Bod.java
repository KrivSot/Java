
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
    public int getBodX()
    {
        return this.x;
    }
    
    @Override
    public int getBodY()
    {
        return this.y;
    }
    
    @Override
    public void setX(int x)
    {
        this.x = x;
    }
    
    @Override
    public void setY(int y)
    {
        this.y = y;
    }
}

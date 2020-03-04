/*******************************************************************************
 * Instance třídy {@code primka} představují ...
 * The {@code primka} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class primka 
{
    protected IBod bod1;
    protected IBod bod2;
    /***************************************************************************
     */
    public primka(IBod bod1,IBod bod2)
    {
        this.bod1 = bod1;
        this.bod2 = bod2;
    }
    
    public primka(int x1,int y1, int x2, int y2)
    {
        this.bod1.setX(x1);
        this.bod1.setY(y1);
        this.bod2.setX(x2);
        this.bod2.setY(y2);
    }
    
    public void SetX1(int x1)
    {
        this.bod1.setX(x1);
    }
    
    public void SetY1(int y1)
    {
        this.bod1.setY(y1);
    }
    
    public void SetX2(int x2)
    {
        this.bod2.setX(x2);
    }
    
    public void SetY2(int y2)
    {
        this.bod2.setX(y2);
    }
}
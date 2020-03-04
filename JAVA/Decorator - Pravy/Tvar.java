/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Tvar} představují ...
 * The {@code Tvar} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Tvar implements IBod
{
    protected IBod bod1;
    int width;
    int height;
    public Tvar(IBod bod1,int w,int h)
    {
        this.bod1 = bod1;
        this.width = w;
        this.height = h;
    }
    
    public void setX1aY1(int x,int y)
    {
        this.bod1.setX1aY1(x,y);
    }
    
    public void setX2aY2(int x,int y)
    {
        setX1aY1(x,y);
    }
    
    public int getBodX1()
    {
        return this.bod1.getBodX1();
    }
    
    public int getBodX2()
    {
        return getBodX1();
    }
    public int getBodY1()
    {
        return this.bod1.getBodY1();
    }
    public int getBodY2()
    {
        return getBodY1();
    }
}
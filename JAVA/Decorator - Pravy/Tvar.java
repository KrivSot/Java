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
    int x = 50;
    int y = 50;
    /***************************************************************************
     */
    public Tvar()
    {
    }
    
    @Override
    public void vykresli() {
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
}

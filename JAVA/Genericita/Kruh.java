/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Kruh} představují ...
 * The {@code Kruh} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Kruh extends Obrazec
{
    protected double r;
    
    /***************************************************************************
     */
    public Kruh(double x, double y, double r)
    {
        super(x,y);
        this.r = r;
    }
    
    public double obvod() { return 2*3.141592 * r;}
    public double obsah() { return 3.141592 * r * r;}
}

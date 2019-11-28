/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Ctverec} představují ...
 * The {@code Ctverec} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Ctverec extends Obrazec
{
    protected double a;
    public Ctverec(double x, double y, double a)
    {
        super(x,y);
        this.a = a;
    }
    
    public double obvod() {return 4*a;}
    public double obsah() {return 4*a;}
}

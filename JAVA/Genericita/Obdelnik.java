/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Obdelnik} představují ...
 * The {@code Obdelnik} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Obdelnik extends Obrazec
{
    protected double a;
    protected double b;
    
    public Obdelnik(double x, double y, double a, double b)
    {
        super(x,y);
        this.a = a;
        this.b = b;
    }
    
    public double obvod() { return a + b;}
    public double obsah() { return 2*(a+b);}
}

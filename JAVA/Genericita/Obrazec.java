/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Obrazec} představují ...
 * The {@code Obrazec} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public abstract class Obrazec
{
    protected double x;
    protected double y;
    public Obrazec(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public abstract double obvod();
    public abstract double obsah();
    
}
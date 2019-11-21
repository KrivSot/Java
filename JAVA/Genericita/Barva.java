/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */



import java.awt.Color;
/*******************************************************************************
 * Instance třídy {@code Barva} představují ...
 * The {@code Barva} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Barva <TColor>
{
    /***************************************************************************
     */
    private TColor color;
    public Barva(TColor color)
    {
        this.color = color;
    }
    
    public void setColor(TColor color)
    {
        this.color = color;
    }
    
    public TColor getColor()
    {
        return this.color;
    }
}

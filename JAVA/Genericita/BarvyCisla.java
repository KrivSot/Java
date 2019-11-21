/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.lang.reflect.Array;

/*******************************************************************************
 * Instance výčtového typu {@code BarvyCisla} představují ...
 * The {@code BarvyCisla} enum type instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public enum BarvyCisla
{
//\CE== ENUMERATED VALUES ======================================================

    Zelená (0,255,0),
    Červená (255,0,0),
    Modrá (0,0,255);
    
    private int r;
    private int g;
    private int b;
    
    /***************************************************************************
     */
    private BarvyCisla(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR()
    {
        return this.r;
    }
    
    public int getG()
    {
        return this.g;
    }
    
    public int getB()
    {
        return this.b;
    }

}

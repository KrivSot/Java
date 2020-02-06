/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Trojuhelnik} představují ...
 * The {@code Trojuhelnik} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Trojuhelnik implements ITvar
{
    String t1 = "  /\\";
    String t2 = " /  \\";
    String t3 = "/____\\";
    @Override
    public String vykresliTvar()
    {
        return t1+"\n"+t2+"\n"+t3+"\n";
    }
    public String getTvar()
    {
        return "Trojuhelnik";
    }
}

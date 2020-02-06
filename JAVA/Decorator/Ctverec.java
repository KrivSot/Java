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
public class Ctverec implements ITvar
{
    String t1 = "|¨¨¨¨¨¨¨¨¨¨|";
    String t2 = "|          |";
    String t3 = "|          |";
    String t4 = "|          |";
    String t5 = "|__________|";
    @Override
    public String vykresliTvar()
    {
        return  t1+"\n"+t2+"\n"+t3+"\n"+t4+"\n"+t5;
    }
    public String getTvar()
    {
        return "Ctverec";
    }
}

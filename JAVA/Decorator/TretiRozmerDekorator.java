/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code TretiRozmerDekorator} představují ...
 * The {@code TretiRozmerDekorator} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TretiRozmerDekorator implements ITvar
{
    /***************************************************************************
     */
    
  String o[][] = {   {" /¨¨¨¨¨¨¨¨¨¨¨/|"},
                     {"/           / |"},
                     {"|¨¨¨¨¨¨¨¨¨¨|  |"}, 
                     {"|          |  |"},
                     {"|          |  |"},
                     {"|          |  |"},
                     {"|          |  |"},
                     {"|          |  |"},
                     {"|          |  |"},
                     {"|          |  |"},
                     {"|          |  /"},
                     {"|          | /"},
                     {"|__________|/"}};
                     
  String c[][] = {   {" /¨¨¨¨¨¨¨¨¨¨¨/|"},
                     {"/           / |"},
                     {"|¨¨¨¨¨¨¨¨¨¨|  |"}, 
                     {"|          |  |"},
                     {"|          |  /"},
                     {"|          | /"},
                     {"|__________|/"}};
                    
  String t[][] = {
                     {"  /\\¨¨¨¨/"},
                     {" /  \\  /"},
                     {"/____\\/"}};
    String tvar;
    public TretiRozmerDekorator(ITvar Itvar)
    {
        tvar = Itvar.getTvar();
        vykresliTvar();
    }
    @Override
    public String vykresliTvar()
    {   
        switch(tvar)
        {
            case "Obdelnik": return o[0][0] + "\n"+o[1][0] + "\n"+o[2][0] + "\n"+o[3][0] + "\n"+o[4][0] + "\n"+o[5][0] + "\n"+o[6][0] + "\n"+o[7][0] + "\n"+o[8][0] + "\n"+o[9][0] + "\n"+o[10][0] + "\n"+o[11][0] + "\n"+o[12][0];
            case "Ctverec": return c[0][0] + "\n"+c[1][0] + "\n"+c[2][0] + "\n"+c[3][0] + "\n"+c[4][0] + "\n"+c[5][0] + "\n"+c[6][0];
            case "Trojuhelnik": return t[0][0] + "\n"+t[1][0] + "\n"+t[2][0];
        }
        return "";
    }
    public String getTvar()
    {
        return "";
    }
}

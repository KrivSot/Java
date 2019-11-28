/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Date;


/*******************************************************************************
 * Instance třídy {@code Ridic} představují ...
 * The {@code Ridic} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Ridic extends Zamestnanec
{
    public Ridic(String jmeno, String prijmeni, double plat)
    {
        super(jmeno,prijmeni,new Date(2000, 11, 9),plat);
    }
    
    public void pracuj()
    {
        System.out.println("Řídím a převážím zboží");
    }
}

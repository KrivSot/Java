/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
import java.util.Date;



/*******************************************************************************
 * Instance třídy {@code Skladnik} představují ...
 * The {@code Skladnik} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Skladnik extends Zamestnanec
{
    /***************************************************************************
     */
    public Skladnik(String jmeno, String prijmeni, double plat)
    {
        super(jmeno,prijmeni,new Date(2005, 5, 4),plat);
    }
    
    public void pracuj()
    {
        System.out.println("Ukládám zboží do skladu.");
    }
}

/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
import java.util.Date;



/*******************************************************************************
 * Instance třídy {@code Sekretarka} představují ...
 * The {@code Sekretarka} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Sekretarka extends Zamestnanec
{
    /***************************************************************************
     */
    public Sekretarka(String jmeno, String prijmeni, double plat)
    {
        super(jmeno,prijmeni, new Date(2004, 6, 1) ,plat);
    }
    
    public void pracuj()
    {
        System.out.println("Píšu dopisy a dělám kávu.");
    }
}

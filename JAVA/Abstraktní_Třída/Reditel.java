/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
import java.util.Date;



/*******************************************************************************
 * Instance třídy {@code Reditel} představují ...
 * The {@code Reditel} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Reditel extends Zamestnanec
{
    Zamestnanec[] zamestnanci;
    
    
    /***************************************************************************
     */
    public Reditel(String jmeno, String prijmeni,Zamestnanec[] zam, double plat)
    {
        super(jmeno,prijmeni,new Date(1990, 1, 1),plat);
        this.zamestnanci = zam;
    }

    public void pracuj()
    {
        System.out.println("Velím těmto zaměstnancům: ");
        for( Zamestnanec zam: zamestnanci)
        {
            System.out.println(zam.GetJmeno());
        }
    }
}

/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.time.*;

/*******************************************************************************
 * Třída {@code Test} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Test
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Zamestnanec ridicTonda = new Ridic("Tonda", "Novák",10000);
        //ridicTonda.pracuj();
        Zamestnanec ridicPepa = new Ridic("Josef", "Kroutil", 21000);
        //ridicPepa.pracuj();
        Zamestnanec skladnikLojza = new Skladnik("Alois", "Chromý", 18000);
        //skladnikLojza.pracuj();
        Zamestnanec sekretarkaMarka = new Sekretarka("Marie", "Psavá", 20000);
        //sekretarkaMarka.pracuj();
        Zamestnanec[] zamestnanci1 = {ridicTonda, ridicPepa, skladnikLojza, sekretarkaMarka};
        Zamestnanec reditel = new Reditel ("Pavel", "Moudrý",zamestnanci1, 60000);
        Zamestnanec[] zamestnanci2 = {ridicTonda, ridicPepa, skladnikLojza, sekretarkaMarka,reditel};
        for(Zamestnanec z : zamestnanci2)
        {
            System.out.println(z.GetJmeno()+" který zde pracuje "+z.PocetLetPrace(LocalDate.now().getYear())+" let");
            z.pracuj();
            System.out.println();
        }
    }
}

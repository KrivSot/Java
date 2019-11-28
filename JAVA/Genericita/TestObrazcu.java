/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Třída {@code TestObrazcu} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TestObrazcu
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Obrazec odbel1 = new Obdelnik(0,0,5,6);
        System.out.println("obdelník obvod:"+odbel1.obvod());
        
        Obrazec[] pole = new Obrazec[] {
            new Obdelnik(0,0,2,5),
            new Kruh(0,0,1),
            new Ctverec(0,0,4)};
        for (Obrazec obr:pole)
        {
            System.out.print("pole["+obr+"]:");
            System.out.print("obvod= "+obr.obvod());
            System.out.println("obsah= "+obr.obsah());
        }
    }
}

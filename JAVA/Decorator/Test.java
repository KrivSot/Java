/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




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
        ITvar tvar1 = new Trojuhelnik();
        ITvar tvar2 = new Obdelnik();
        ITvar tvar3 = new Ctverec();
        TretiRozmerDekorator trd1 = new TretiRozmerDekorator(tvar1);
        TretiRozmerDekorator trd2 = new TretiRozmerDekorator(tvar2);
        TretiRozmerDekorator trd3 = new TretiRozmerDekorator(tvar3);
        System.out.println(tvar1.vykresliTvar());
        System.out.println("*****************************");
        System.out.println(tvar2.vykresliTvar());
        System.out.println("*****************************");
        System.out.println(tvar3.vykresliTvar());
        System.out.println("*****************************");
        System.out.println(trd1.vykresliTvar());
        System.out.println("*****************************");
        System.out.println(trd2.vykresliTvar());
        System.out.println("*****************************");
        System.out.println(trd3.vykresliTvar());
    }
}

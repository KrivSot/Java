/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;



/*******************************************************************************
 * Testovací třída {@code Testa} slouží ke komplexnímu otestování
 * třídy {@link Testa}.
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TestA
{
        Osoby osoba0 = new Osoby("Kryštof",Smer.SEVER,true,10);
        Osoby osoba1 = new Osoby("Filip",Smer.SEVER,false,55);
        Osoby osoba2 = new Osoby("Tomáš",Smer.JIH,false,17);
        Osoby osoba3 = new Osoby("Lad",Smer.SEVER,true,60);
        Osoby osoba4 = new Osoby("Michal",Smer.ZAPAD,false,40);
        Vozidlo vzd = new Vozidlo(osoba0);

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testSetUp()throws InterruptedException
    {
        /*Osoby osoba0 = new Osoby("Kryštof",Smer.SEVER,true,50);
        Osoby osoba1 = new Osoby("Filip",Smer.SEVER,false,5);
        Osoby osoba2 = new Osoby("Tomáš",Smer.JIH,false,17);
        Osoby osoba3 = new Osoby("Lad",Smer.SEVER,true,60);
        Osoby osoba4 = new Osoby("Michal",Smer.ZAPAD,false,40);
        Vozidlo vzd = new Vozidlo(osoba0);*/
        vzd.pridejOsobu(osoba4);
        vzd.pridejOsobu(osoba1);
        vzd.pridejOsobu(osoba2);
        vzd.pridejOsobu(osoba3);
        vzd.VypisOsoby();
        vzd.jedem();
    }

}

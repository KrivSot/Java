/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;



/*******************************************************************************
 * Testovací třída {@code Test} slouží ke komplexnímu otestování
 * třídy {@link Test}.
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Body
{

    Platno pl = new Platno();
    Bod bod1 = new Bod(150,120);
    Bod bod2 = new Bod(200,160);
    Bod bod3 = new Bod(175,100);
    primka primka = new primka(bod1,bod2);
    Tvar tvar1 = new Tvar(bod1,30,30);
    /***************************************************************************
     * Inicializace předcházející spuštění každého testu a připravující tzv.
     * přípravek (fixture), což je sada objektů, s nimiž budou testy pracovat.
     */
    @Before
    public void setUp()
    {
    }


    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každého testu.
     */
    @After
    public void tearDown()
    {
    }



//\TT== TESTS PROPER ===========================================================

    /***************************************************************************
     * Test of the {@link #setUp()} method preparing the test fixture.
     */
    @Test
    public void testSetUp()
    {
    }

}

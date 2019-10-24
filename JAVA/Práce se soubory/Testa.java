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
public class Testa
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================

        Osoby osoba0 = new Osoby("Kryštof",Smer.SEVER,true,10);
        Osoby osoba1 = new Osoby("Filip",Smer.SEVER,false,55);
        Osoby osoba2 = new Osoby("Tomáš",Smer.JIH,false,17);
        Osoby osoba3 = new Osoby("Lad",Smer.SEVER,true,60);
        Osoby osoba4 = new Osoby("Michal",Smer.ZAPAD,false,40);
        Vozidlo vzd = new Vozidlo(osoba0);

//##############################################################################
//\CI== STATIC INITIALIZER (CLASS CONSTRUCTOR) =================================
//\CG== CLASS (STATIC) GETTERS AND SETTERS =====================================
//\CM== OTHER NON-PRIVATE CLASS (STATIC) METHODS ===============================
//\CP== PRIVATE AND AUXILIARY CLASS (STATIC) METHODS ===========================



//##############################################################################
//\IC== CONSTANT INSTANCE ATTRIBUTES (FIELDS) ==================================
//\IV== VARIABLE INSTANCE ATTRIBUTES (FIELDS) ==================================



//##############################################################################
//\II== CONSTRUCTORS AND FACTORY METHODS =======================================
//----- Test class manages with empty default constructor ----------------------



//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================



//##########################################################################
//\TC== PREPARATION AND CLEAN UP OF THE CLASS FIXTURE ==========================
//\TI== PREPARATION AND CLEAN UP OF THE TEST FIXTURE ==========================

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

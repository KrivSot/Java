import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*******************************************************************************
 * Instance třídy {@code Osoba} představují ...
 * The {@code Osoba} class instances represent ...
 *
 * @author  Kryštof Jania
 * @version 2.00.0000 — 2019-10-24
 */
public class Osoby
{
    boolean ridic;
    int vzdálenost;
    String jméno;
    Smer smer;
    public Osoby(String jméno, Smer smer, boolean JeRidic,int vzdalenost)
    {
        this.ridic = JeRidic;
        this.vzdálenost = vzdalenost;
        this.jméno = jméno;
        this.smer = smer;
    }
    
    public boolean JeRidic()
    {
        return this.ridic;
    }
    
    public int Vzdálenost()
    {
        return this.vzdálenost;
    }
    
    public Smer smer()
    {
        return this.smer;
    }
}

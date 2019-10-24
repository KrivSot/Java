/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*******************************************************************************
 * Instance třídy {@code Osoba} představují ...
 * The {@code Osoba} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
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

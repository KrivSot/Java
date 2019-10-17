/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */



import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/*******************************************************************************
 * Instance třídy {@code Aplikace} představují ...
 * The {@code Aplikace} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Aplikace
{
    /***************************************************************************
     */
    public Aplikace()throws InterruptedException
    {
       Osoba osb = new Osoba();
       System.out.println("Chce jet " +osb.PocetOsob()+" z toho "+osb.Ridici()+" mají auto");
       System.out.println("Kolik lidí chcete nabrat ?");
       osb.ujetavzdalenost();
    }
}

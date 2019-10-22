/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*******************************************************************************
 * Instance třídy {@code Vozidlo} představují ...
 * The {@code Vozidlo} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Vozidlo
{
    int pocetlidi =0;
    Osoby[] osoby = new Osoby[4];
    Boolean maRidice = false;
    Smer smer;
    int[] lidiV;
    /***************************************************************************
     */
    public Vozidlo()
    {
        
    }
    
    public void pridejridice(Osoby osb)
    {
        boolean r = osb.JeRidic();
        if((maRidice != true) && (r = true))
        {
            osoby[0] = osb;
            maRidice = true;
        }
        else
        {
            System.out.println("Osoba neni ridic nebo auto uz ma ridice");
        }
    }
    
    public void jedem()throws InterruptedException
    {
       System.out.println("Jak daleko chcete jet");
       Scanner sc = new Scanner(System.in);
       int vzdalenost = Integer.valueOf(sc.next());
       System.out.println("Jakým směrem chete jet?(např: sever = Smer.SEVER)");
       Scanner sd = new Scanner(System.in);
       this.lidiV = new int[10];
       this.lidiV[0] = vzdalenost;
       smer = Smer.valueOf(sd.next());
        for(int i = 0; i< vzdalenost;i++)
            {
                if((i % 5) == 0)
                {
                    System.out.println("ujeli jste "+i+"kilometrů");
                    Thread.sleep(500);
                }
                for(int j = 0; j< this.osoby.length;j++)
                {
                    if(this.lidiV[j] == i)
                    {
                        System.out.println("Cestujici "+ osoby[j]+" vystoupil na "+i+"kilometru");
                        Thread.sleep(1500);
                    }
                }
            }
            System.out.println("Dojeli jste do cíle");
            for(int i = 0;i<this.lidiV.length;i++)
            {
                if(lidiV[i] > vzdalenost)
                {
                    System.out.print(osoby[i]+", ");
                }
            }
            System.out.print("jdou/jedou dál");
    }
}

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
public class Osoba
{
    String[] osoby = {"Kryštof","Luděk","Adéla","Bronislav","Boris","Boleslav",
    "Marie","Ludmil","Denisa","Lubor","Filip","Matouš","Tomáš","Lenka"};
    int pocetosob;
    Boolean[] ridic;
    int[] Vzdalenost;
    int vzdalenost;
    /***************************************************************************
     */
    public Osoba()
    {
       int randomNum = ThreadLocalRandom.current().nextInt(0, 8 + 1);
       Smer smer = Smer.SEVER;
       SmerJizdy(randomNum, smer);
       randomNum = ThreadLocalRandom.current().nextInt(4, 13 + 1);
       String[] pocetOsob = new String[randomNum];
       pocetosob = randomNum;
       ridic = new Boolean[randomNum];
       Vzdalenost = new int[randomNum];
       NaplnLidi(randomNum,pocetOsob);
       for(int i = 0;i < pocetOsob.length;i++)
       {
           boolean predchozi = false;
           int random = ThreadLocalRandom.current().nextInt(0, 1 + 1);
           switch(random)
           {
               case 0: ridic[i] = false; break;
               case 1: if(predchozi){ predchozi = !predchozi; break; }
                       else{ridic[i] = true; predchozi = !predchozi; break;}
               default: System.out.println("Chyba"); break;
           }
       }
       System.out.println("Jak daleko chcete jet");
       Scanner sc = new Scanner(System.in);
       vzdalenost = Integer.valueOf(sc.next());
       for(int i =0;i<Vzdalenost.length;i++)
       {
           int random = ThreadLocalRandom.current().nextInt(1, vzdalenost +100 + 1);
           Vzdalenost[i] = random;
       }
    }
    
    public Smer SmerJizdy(int Int,Smer smer)
    {
       switch(Int)
       {
           case 1: smer = Smer.SEVER; break;
           case 2: smer = Smer.VYCHOD; break;
           case 3: smer = Smer.JIH; break;
           case 4: smer = Smer.ZAPAD; break;
           case 5: smer = Smer.SEVEROVYCHOD; break;
           case 6: smer = Smer.SEVEROZAPAD; break;
           case 7: smer = Smer.JIHOVYCHOD; break;
           case 8: smer = Smer.JIHOZAPAD; break;
       }
       return smer;
    }
    
    public String[] NaplnLidi(int cislo,String[] pole)
    {
        for(int i = 0;i< pole.length;i++)
        {
            int random = ThreadLocalRandom.current().nextInt(0, 13 + 1);
            pole[i] = osoby[random];
        }
        return pole;
    }
    
    public int PocetOsob()
    {
      return this.pocetosob;
    }
    
    public int Ridici()
    {
        int pocitadlo = 0;
        for(int i = 0;i<ridic.length;i++)
        {
            if(ridic[i])
            {
                pocitadlo++;
            }
        }
        return pocitadlo;
    }
    
    public void ujetavzdalenost()throws InterruptedException
    {
        for(int i = 0; i< this.vzdalenost;i++)
        {
            if((i % 5) == 0)
            {
                System.out.println("ujeli jste "+i+"kilometrů");
                Thread.sleep(500);
            }
            for(int j = 0; j< this.Vzdalenost.length;j++)
            {
                if(this.Vzdalenost[j] == i)
                {
                    System.out.println("Cestujici "+ osoby[j]+" vystoupil na "+i+"kilometru");
                    Thread.sleep(1500);
                }
            }
        }
        System.out.println("Dojeli jste do cíle. Zbytek lidí vystoupilo a nebo jde/jede dál");
    }
}

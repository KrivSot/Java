import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*******************************************************************************
 * Instance třídy {@code Vozidlo} představují ...
 * The {@code Vozidlo} class instances represent ...
 *
 * @author  Kryštof Jania
 * @version2 3.00.0000 — 2019-11-07
 */
public class Vozidlo
{
    int pocetlidi =0;
    Osoby[] osoby = new Osoby[5];
    Boolean maRidice = false;
    Smer smer;
    public Vozidlo(Osoby osb)
    {
        boolean r = osb.JeRidic();
        if((maRidice == false) && (r == true))
        {
            this.osoby[0] = osb;
            maRidice = true;
            this.smer = osb.smer;
            pocetlidi++;
        }
        else
        {
            System.out.println("Osoba není ridič!!");
        }
    }
    
    public Vozidlo(){}

    public void VypisSmer()
    {
        System.out.println(this.smer);
    }
    
    public boolean MaRidice()
    {
        return maRidice;
    }
    
    public void VypisOsoby()
    {
        System.out.println("Jméno, Smer, JeRidic, vzdálenost(km)");
        for(int i =0;i<this.osoby.length;i++)
        {
            if(osoby[i] != null)
            {
                System.out.println(osoby[i].jméno+" , "+osoby[i].smer+" , "+osoby[i].ridic+" , "+osoby[i].vzdálenost);
            } 
        }   
    }
    
    public void pridejOsobu(Osoby osb)
    {
        if(pocetlidi < 5 && maRidice == true)
        {
            if(this.osoby[0].smer == osb.smer)
            {
                this.osoby[pocetlidi] = osb;
                pocetlidi++;
            }
            else
            {
                System.out.println("Osoba nejede stejným směrem");
            }
        }
        else if(maRidice == true)
        {
            System.out.println("Víc lidí se do auta nevejde.");
        }
        else
        {
            System.out.println("Vozidlo nemá řidiče.");
        }
    }
    
    public void pridejridice(Osoby osb)
    {
        boolean r = osb.JeRidic();
        if((maRidice == false) && (r == true))
        {
            this.osoby[0] = osb;
            maRidice = true;
            this.smer = osb.smer;
            pocetlidi++;
        }
        else if(r==false)
        {
            System.out.println("Osoba není ridič!");
        }
        else
        {
            System.out.println("Auto už má řidiče.");
        }
    }
    
    public void jedem()throws InterruptedException
    {
       if(this.maRidice == true)
       {
           //StejnySmer();
           Jet();
           System.out.println("Dojeli jste do cíle");
           System.out.println();
           KdoJedeDal();
           this.osoby[0] = null;
           this.smer = null;
           this.pocetlidi = 0;
       }
       else
       {
           System.out.println("auto nemá řidiče!!");
       }
    }
    
    private void StejnySmer()
    {
        for(int k = 0; k< this.osoby.length;k++)
        {
            if(this.osoby[k] != null)
            {
                if(this.osoby[k].smer != this.osoby[0].smer)
                {
                    System.out.println("Cestujici "+ osoby[k].jméno+" nenastoupil, protože chce jet jiným směrem");
                }
            }
        }
    }
    
    private void Jet()throws InterruptedException
    {
        for(int i = 0; i< osoby[0].vzdálenost;i++)
           {
               if((i % 5) == 0)
               {
                   System.out.println("ujeli jste "+i+"kilometrů");
                   Thread.sleep(500);
               }
               for(int j = 0; j< this.osoby.length;j++)
               {
                   if(this.osoby[j] != null)
                   {
                       if(this.osoby[j].vzdálenost == i)
                       {
                           System.out.println("Cestujici "+ osoby[j].jméno+" vystoupil na "+i+". kilometru");
                           this.osoby[j] = null;
                           Thread.sleep(1500);
                       }
                   }
               }
           }
    }
    
    private void KdoJedeDal()
    {
        for(int i = 0;i<this.osoby.length;i++)
           {
               if(osoby[i] != null)
               {
                   if(osoby[i].vzdálenost > osoby[0].vzdálenost)
                   {
                       System.out.print(osoby[i].jméno+", ");
                       this.osoby[i] = null;
                       System.out.print("jde/jede dál.");
                       System.out.println();
                   }
               }
           }
    }
}
/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;


/*******************************************************************************
 * Instance třídy {@code App} představují ...
 * The {@code App} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class App
{

    String FilePath = "Osoby.txt";
    Osoby[] osoby;
    boolean maridice = false;
    /***************************************************************************
     */
    public App()throws FileNotFoundException, UnsupportedEncodingException, IOException, InterruptedException
    {
        Vozidlo vzd = new Vozidlo();
        this.osoby = nactiosoby();
        for(int i = 0;i<osoby.length;i++)
        {
            if(this.osoby[i].JeRidic() && maridice == false)
            {
                vzd.pridejridice(osoby[0]); maridice = true; break;
            }
            else if(maridice == false) { System.out.println("Žádna z osob není řidič"); }
            else{ break; }
        }
        
        for(int i = 1;i<osoby.length;i++)
        {
            vzd.pridejOsobu(osoby[i]);
        }
        vzd.jedem();
    }

    private Osoby[] nactiosoby()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        int pocetr = 0;
        int pocet = 0;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath), "UTF-8"));
        String line = null;
        while((line = bReader.readLine()) != null)
        {
            pocetr++;
        }
        Osoby[] osoby = new Osoby[pocetr];
        String[] text = new String[pocetr];
        BufferedReader bReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath), "UTF-8"));
        while((line = bReader2.readLine()) != null)
        {
            text[pocet] = line; 
            pocet++;
        }
        
        for(int i=0;i<pocetr;i++)
        {
            int carka = text[i].indexOf(",",0);
            String jmeno = text[i].substring(0,carka);
            int carka2 = text[i].indexOf(",",carka+1);
            Smer smer2 = Smer.valueOf(text[i].substring(carka+1,carka2));
            int carka3 = text[i].indexOf(",",carka2+1);
            boolean ridic = Boolean.valueOf(text[i].substring(carka2+1,carka3));
            int v = Integer.valueOf(text[i].substring(carka3+1,text[i].indexOf(";")));
            osoby[i] = new Osoby(jmeno,smer2,ridic,v);
        }
        return osoby;
    }


//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}

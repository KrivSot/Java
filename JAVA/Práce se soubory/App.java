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
    int[] Vzdalenost;
    /***************************************************************************
     */
    public App()
    {
    }

    private String nactiosoby()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        int pocetr = 0;
        int pocet = 0;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath), "UTF-8"));
        String line = null;
        while((line = bReader.readLine()) != null)
        {
            pocetr++;
        }
        String[] text = new String[pocetr];
        Vzdalenost = new int[pocetr];
        BufferedReader bReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath), "UTF-8"));
        while((line = bReader2.readLine()) != null)
        {
            text[pocet] = line; 
            pocet++;
        }
        int carka = text[0].indexOf(",",0);
        String jmeno = text[0].substring(0,carka);
        int carka2 = text[0].indexOf(",",carka+1);
        Smer smer2 = Smer.valueOf(text[0].substring(carka+1,carka2));
        int carka3 = text[0].indexOf(",",carka2+1);
        boolean ridic = Boolean.valueOf(text[0].substring(carka2+1,carka3));
        int v = Integer.valueOf(text[0].substring(carka3+1,text[0].indexOf(";")));
        return jmeno;
    }


//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}

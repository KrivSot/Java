/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;


/*******************************************************************************
 * Instance třídy {@code NactiKnihu} představují ...
 * The {@code NactiKnihu} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class NactiKnihu
{
    String FilePath = "aliceInWonderland.txt";
    String filePath;
    String fileEncoding = "UTF-8";
    String slovo;
    String[] text;
    /***************************************************************************
     */
    public NactiKnihu()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        int lineCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Co za knihu chcete nacist?");
        filePath = sc.next()+".txt";
        lineCount = PocetRadku();
        text = new String[lineCount];
        System.out.println("Jaky slovo chcete vyhledat?");
        Scanner sd = new Scanner(System.in);
        slovo = sd.next();
        NactiKnihu();
        Prectiknihu();
        System.out.println("Slovo "+slovo+" se vyskytuje v knize "+KolikratSeVyskytuje(slovo));
    }
    
    public int PocetRadku()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        int lineCount1 = 0;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        String line = null;
        Scanner scannerKniha = new Scanner(new FileReader(filePath));

        while((line = bReader.readLine()) != null)
        {
            lineCount1++;
        }
        return lineCount1;
    }
    
    public void NactiKnihu()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        String line = null;
        Scanner scannerKniha = new Scanner(new FileReader(filePath));
        int lineCount = 0;
        while((line = bReader.readLine()) != null)
        {   //Dokud mane k dispozici dalsi radek
            text[lineCount] = scannerKniha.nextLine(); 
            lineCount++;
        }
    }
    
    public void Prectiknihu()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        int delka = text.length;
        for(int i = 0;i<delka;i++)
        {
            System.out.println(text[i]);
        }
    }
    
    public int KolikratSeVyskytuje(String slovo)throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String text = "";
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        String line = null;
        while((line = bReader.readLine()) != null)
        {
            text = text + line; 
        }
        int cislo = 0;
        int DelkaTextuPoOdectu = text.replaceAll(slovo, "").length();
        cislo = ((text.length() - DelkaTextuPoOdectu)/slovo.length());
        return cislo;
    }


//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}

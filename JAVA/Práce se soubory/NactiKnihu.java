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
    int pocet;
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
        pocet = KolikratSeVyskytuje(slovo);
        NactiKnihu();
        PrectiKapitolu();
        Prectiknihu();
        System.out.println("Slovo "+slovo+" se vyskytuje v knize "+pocet);
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
    
    public void PrectiKapitolu()throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        System.out.println("Jakou kapitolu chcete vypsat? (napiste cislo)");
        Scanner sf = new Scanner(System.in);//vytvorit aplikaci, ktera umozni sdilenou jizdu osob (sever,severovychod vychod zapad severozapad,jih, JZ, JV) trida osoba,odoby co jedou a maji auto jedou, ty co nemaji taky chteji jet nekam, auto vezme na palubu lidid co chteji jet, ale musi jet stejnym smerem, musi zadat vzdalenost, kontroluji se kilometry a az doběhnout tak osoba vystoupí
        String slovo2 = sf.next();
        switch(slovo2)
        {
            case "1": NacitKapitolu(1); break;
            case "2": NacitKapitolu(2); break;
            case "3": NacitKapitolu(3); break;
            case "4": NacitKapitolu(4); break;
            case "5": NacitKapitolu(5); break;
            case "6": NacitKapitolu(6); break;
            case "7": NacitKapitolu(7); break;
            case "8": NacitKapitolu(8); break;
            case "9": NacitKapitolu(9); break;
            case "10": NacitKapitolu(10); break;
            case "11": NacitKapitolu(11); break;
            case "12": NacitKapitolu(12); break;
            default: System.out.println("Tato kapitola v knize není.");break;
        }
    }
 
    public void NacitKapitolu(int k)throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String text = "";
        int lineCount2 = 0;
        String line = null;
        String[] kapitola = new String[PocetRadku()];
        int delka = kapitola.length;
        int indexd = 0;
        String veta;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        Scanner scannerKniha = new Scanner(new FileReader(filePath));
        while((line = bReader.readLine()) != null)
        {
                kapitola[lineCount2] = scannerKniha.nextLine(); 
                lineCount2++;
        }
        switch(k)
        {
            case 1:    delka = kapitola.length;
                       indexd = 0;
                        for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER I");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER II");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 2: 
                       delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER II");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER III");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 3:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER III");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER IV");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 4:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER IV");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER V");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 5:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER V");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER VI");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 6:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER VI");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER VII");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 7:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER VII");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER VIII");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 8:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER VIII");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER IX");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 9:    delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER IX");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER X");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 10:   delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER X");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER XI");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 11:   delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER XI");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }
                       
                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER XII");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            case 12:   delka = kapitola.length;
                       indexd = 0;
                       for(int j = 0;j<delka;j++)
                       {
                           veta = kapitola[j];
                           int index = veta.indexOf("CHAPTER XI");
                           if(index != -1)
                           {
                               indexd = index;
                               break;
                           }
                       }

                       for(int i = indexd;i<delka;i++)
                       {
                           int index = kapitola[i].indexOf("CHAPTER XII");
                               if(index == -1)
                               {
                                   System.out.println(kapitola[i]);
                               }
                               else
                               {
                                   break;
                               }
                       } break;
            default: System.out.println("Tato kapitola v knize není.");break;
        }
    }
}

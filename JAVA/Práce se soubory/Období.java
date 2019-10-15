import java.util.*;
public enum Období
{

JARO ("Máj, vyženeme husi v háj",12),
LÉTO ("Prázdniny",27),
PODZIM ("Listopad - měsíc knihy",15),
ZIMA ("Únor bílý - pole sílí",10);

private final String poznámka;
private final int PocetSlunecnichDnu;
   
    private Období(String str, int pSD)
    {
        this.poznámka = str;
        this.PocetSlunecnichDnu = pSD;
    }
    
    public String getParametry()
    {
        return this.poznámka+" "+this.PocetSlunecnichDnu;
    }
    
    public static String činnost( Období období)
    {
        switch( období )
        {
            case JARO: return "kvete";
            case LÉTO: return "zraje";
            case PODZIM: return "plodí";
            case ZIMA: return "spí";
            default: throw new IllegalArgumentException("Neočekávaná hodnota parametru období="+období );
        }
    }

}

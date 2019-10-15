import java.util.*;
import java.awt.Color;
public class TiskObdobí
{
    public static void main(String[] args)
    {
        for(Období obd : Období.values())
            System.out.println(obd+"   "+obd.ordinal()+" "+obd.getParametry());
            
            EnumSet<Období> set0 = EnumSet.allOf(Období.class);
            System.out.println("Set0 obsahuje všechny období:" + set0);
            EnumSet<Období> set1 = EnumSet.of(Období.JARO);
            System.out.println("Set1:"+set1);
            EnumSet<Období> set2 = EnumSet.complementOf(set1);
            System.out.println("Set2 obsahuje to co neobsahuje set1:"+set2);
            EnumSet<Období> set3 = EnumSet.range(Období.LÉTO, Období.ZIMA);
            System.out.println("Set3 obsahuje rozsah:"+set3);
        
        for(Období obd: Období.values())
        {
            System.out.println(obd+"   "+obd.činnost(obd));
        }
    }
}

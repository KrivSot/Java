import java.awt.Color;
/*******************************************************************************
 * Třída {@code Testt} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Testt
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Barva<String> barva1 = new Barva<String>("Žlutá");
        System.out.println(barva1.getColor());
        barva1.setColor("Modrá");
        System.out.println(barva1.getColor());
        
        Barva<Color> barva2 = new Barva<Color>(Color.red);
        System.out.println(barva2.getColor());
        barva2.setColor(Color.pink);
        System.out.println("Nyní je barva růžová "+barva2.getColor());
        
        Barva<BarvyCisla> barva3 = new Barva<BarvyCisla>(BarvyCisla.Zelená);
        System.out.println(barva3.getColor());
        System.out.println(BarvyCisla.Zelená.getR()+" "+BarvyCisla.Zelená.getG()+" "+BarvyCisla.Zelená.getB());
        barva3.setColor(BarvyCisla.Červená);
        System.out.println(barva3.getColor());
        System.out.println(BarvyCisla.Červená.getR()+" "+BarvyCisla.Červená.getG()+" "+BarvyCisla.Červená.getB());
        
        Barva<Integer> barva4 = new Barva<Integer>(-16777183);
        System.out.println(barva4.getColor());
        barva4.setColor(-175589241);
        System.out.println(barva4.getColor());
    }
}

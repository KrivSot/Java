/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */




/*******************************************************************************
 * Třída {@code Pokus} je hlavní třídou projektu,
 * který ...
 *
 * @author    jméno autora
 * @version   0.00.000
 */
import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.awt.geom.Arc2D;
import javax.swing.SwingUtilities;
public class Pokus extends JPanel 
{
    public void paintComponent(Graphics g) 
    {
        g.drawString("To je můj Panel!",140,200);
        //JOptionPane.showMessageDialog(null, "Jsem v metodě paintComponent");
        //System.out.println("Jsem zde ");   
    }
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(400, 400);
      f.add(new Pokus(), BorderLayout.CENTER);
      f.setVisible(true);
    }
}

/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*******************************************************************************
 * Třída {@code Platno} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Platno extends JFrame
{
    JFrame jf = new JFrame();
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public Platno()
    {
        jf.setTitle("GUI_project");
        jf.setSize(500,400);
        jf.setPreferredSize(new Dimension(500,400));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.pack();
        jf.setVisible(true);
    }
    
    public void vykresliBod(Bod bod)
    {
        Graphics gr = jf.getGraphics();
        Graphics2D g2d = (Graphics2D) gr;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.blue);
        g2d.drawRect(bod.getBodX(),bod.getBodY(),1,1);
    }
    
    public void vykresliPrimku(primka primka)
    {
        Graphics gr = jf.getGraphics();
        Graphics2D g2d = (Graphics2D) gr;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.red);
        g2d.drawLine(primka.bod1.getBodX(),primka.bod1.getBodY(),(primka.bod2.getBodX()),primka.bod2.getBodY());
    }
    
    public void vykresliTvar(Tvar tvar)
    {
        Graphics gr = jf.getGraphics();
        Graphics2D g2d = (Graphics2D) gr;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.black);
        g2d.draw3DRect(tvar.bod1.getBodX(), tvar.bod1.getBodY(), tvar.width, tvar.height, false);
    }
    
    public void vykresliVse(Tvar tvar, primka primka, Bod bod)
    {
        vykresliBod(bod);
        vykresliPrimku(primka);
        vykresliTvar(tvar);
    }
}
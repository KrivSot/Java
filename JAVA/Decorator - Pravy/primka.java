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

/*******************************************************************************
 * Instance třídy {@code primka} představují ...
 * The {@code primka} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class primka implements IBod
{
    //Platno platno = new Platno();
    Bod bod = new Bod();
    int x = 50;
    int y = 50;
    /***************************************************************************
     */
    public primka()
    {
        vykresli();
    }
    
    @Override
    public void vykresli() {
        Graphics gr = bod.jf.getGraphics();
        Graphics2D g2d = (Graphics2D) gr;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.red);
        g2d.drawLine(bod.getBodX(),bod.getBodY(),(bod.getBodX()+50),bod.getBodY());
    }
    
    @Override
    public int getBodX()
    {
        return this.x;
    }
    
    @Override
    public int getBodY()
    {
        return this.y;
    }
}

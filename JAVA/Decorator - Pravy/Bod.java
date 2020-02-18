import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import java.awt.Canvas;
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
 * Instance třídy {@code Primka} představují ...
 * The {@code Primka} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Bod extends JFrame implements IBod 
{
    /***************************************************************************
     */
    JFrame jf = new JFrame();
    //Platno platno = new Platno();
    int x = 50;
    int y = 50;
    public Bod()
    {
        Platno();
        vykresli();
    }
    
    @Override
    public void vykresli() {
        Graphics gr = jf.getGraphics();
        Graphics2D g2d = (Graphics2D) gr;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.red);
        g2d.drawRect(x,y,1,1);
    }
    
    @Override
    public int getBodX()
    {
        return this.x;
    }
    
    public void Platno(){
        jf.setTitle("GUI_project");
        jf.setSize(500,400);
        //menu generate method
        //generateMenu();
        //this.setJMenuBar(menuBar);
        jf.setPreferredSize(new Dimension(500,400));
        //pane with null layout
        /*JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));*/


        //adding components to contentPane panel

        //adding panel to JFrame and seting of window position and close operation
        //this.add(contentPane);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.pack();
        jf.setVisible(true);
    }
    
    @Override
    public int getBodY()
    {
        return this.y;
    }
}

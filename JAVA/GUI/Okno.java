import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent.*;
import java.awt.event.MouseWheelListener.*;
import java.beans.EventHandler;

public class Okno extends JFrame
{
    
    public Okno()
    {
        this.setSize(640,480);
        this.setTitle("Moje okno");
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Platno platno = new Platno();
        this.add("Center",platno);
        
        //Mrizka mr = new Mrizka(this);
        //add("Center",mr);
    }
}
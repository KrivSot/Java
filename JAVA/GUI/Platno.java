import java.awt.*;

public class Platno extends Canvas
{
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        //g.fillOval(100, 100, 30, 30);
        g.drawString("AHOJ",50,50);
        g.drawLine(100,100,200,200);
        g.drawLine(100,154,200,254);
        g.drawLine(170,100,270,200);
        g.drawLine(170,154,270,254);
        g.draw3DRect(200, 200, 70, 54, false);
        g.fill3DRect(200, 200, 70, 54, false);
        g.draw3DRect(100, 100, 70, 54, true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.awt.geom.Arc2D;
import javax.swing.SwingUtilities;

public class PieChart2 extends JPanel {
   private int originX, originY;
   private int radius;
   private static double d2r = Math.PI / 180.0;
   private Color colors[] = new Color[] { Color.red,
      Color.blue, Color.yellow, Color.black,
      Color.green, Color.white, Color.gray,
      Color.cyan, Color.magenta, Color.darkGray };
      public double[] values;
      private String labels[];
      public int delkap;
   public PieChart2(double[] hodnoty,String[] nazvy) {
      super();
      for(int i =0;i<hodnoty.length;i++)
      {
        if(hodnoty[i] != 0)
        {
            delkap++;
        }
      }
      this.values = new double[delkap];
      this.labels = new String[delkap];
      for(int i =0;i<delkap;i++)
      {
        this.values[i] = hodnoty[i];
        this.labels[i] = nazvy[i];
      }
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(400, 400);
      f.setVisible(true);
   }

   public PieChart2(Color[] colors, double[] values,
         String[] labels) {
      super();
      this.colors = colors;
      this.values = values;
      this.labels = labels;
   }

   public void paintComponent(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      Dimension size = this.getSize();
      originX = size.width / 2;
      originY = size.height / 2;
      int diameter = (originX < originY ?
         size.width - 40 : size.height - 40);
      radius = (diameter / 2) + 1;
      int cornerX = (originX - (diameter / 2));
      int cornerY = (originY - (diameter / 2));
      int startAngle = 0;
      double endAngle = 0.0;
      int arcAngle = 0;

      double sum = 0;

      for (int i = 0; i < values.length; i++)
         sum += values[i];

      for (int i = 0; i < values.length; i++) {
        
         startAngle = (int) (endAngle * 360 / sum);
         arcAngle = (int) (values[i] * 360 / sum);
         g.setColor(colors[i % colors.length]);
         Shape s = new Arc2D.Double(cornerX, cornerY, diameter,
            diameter, startAngle, arcAngle, Arc2D.PIE);
         RadialGradientPaint rgp =
               new RadialGradientPaint(new Point(
            getWidth() / 2, getHeight() / 2),
            diameter, new float[] {0f, 1f },
            new Color[] { colors[i], Color.gray });
         g2d.setPaint(rgp);
         g2d.fill(s);
         drawLabel(g2d, labels[i], startAngle + (arcAngle / 2));
         endAngle += values[i];
      }
      g.setColor(Color.gray);
      g.drawOval(cornerX, cornerY, diameter, diameter);
   }

   public void drawLabel(Graphics g, String text, double angle) {
      g.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
      g.setColor(Color.black);
      double radians = angle * d2r;
      int x = (int) ((radius + 5) * Math.cos(radians));
      int y = (int) ((radius + 5) * Math.sin(radians));
      if (x < 0) {
         x -= SwingUtilities.computeStringWidth(g.getFontMetrics(),
            text);
      }
      if (y < 0) {
         y -= g.getFontMetrics().getHeight();
      }
      g.drawString(text, x + originX, originY - y);
   }

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      double[] hodnoty = new double[]{30,20,14};
      String[] nazvy = new String[]{"Test","Test","Test"};
      f.setSize(400, 400);
      f.add(new PieChart2(hodnoty,nazvy), BorderLayout.CENTER);
      f.setVisible(true);
   }
}

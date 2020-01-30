import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ColorToGrayscale {

   public static void convertToGrayscale(String fromFile,
         String toFile) {
      BufferedImage image = null;
      try {
         image = ImageIO.read(new File(fromFile));
         for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
               Color imageColor = new Color(image.getRGB(j, i));
               int rgb = (int) (imageColor.getRed() * 0.299)
                  + (int) (imageColor.getGreen() * 0.587)
                  + (int) (imageColor.getBlue() * 0.114);
               Color newColor = new Color(rgb, rgb, rgb);
               image.setRGB(j, i, newColor.getRGB());
            }
         }

         ImageIO.write(image, "jpg", new File(toFile));
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void main(String args[]){
      convertToGrayscale("barevny.jpg",
         "sedy.jpg");
   }
}

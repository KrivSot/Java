/* UTF-8 codepage: P��li� �lu�ou�k� k�� �p�l ��belsk� �dy. � � �
 * �Stereotype�, Section mark-�, Copyright-�, Alpha-?, Beta-?, Smile-?
 */




/*******************************************************************************
 * T��da {@code Formular} je hlavn� t��dou projektu,
 * kter� ...
 *
 * @author  author name
 * @version 0.00.0000 � 20yy-mm-dd
 */
public class Formular
{
    /***************************************************************************
     * Metoda, prost�ednictv�m n� se spou�t� cel� aplikace.
     *
     * @param args Parametry p��kazov�ho ��dku
     */
    public static void main(String[] args)
    {
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}

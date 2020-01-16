/* UTF-8 codepage: Pøíliš luouèkı kùò úpìl ïábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-?, Beta-?, Smile-?
 */




/*******************************************************************************
 * Tøída {@code Formular} je hlavní tøídou projektu,
 * kterı ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Formular
{
    /***************************************************************************
     * Metoda, prostøednictvím ní se spouští celá aplikace.
     *
     * @param args Parametry pøíkazového øádku
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

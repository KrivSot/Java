/**
*Text genereted by Simple GUI Extension for BlueJ
*/
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


public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JPanel panel1;
    private JRadioButton radiobutton1;
    private JRadioButton radiobutton2;

    //Constructor 
    public GUI_project(){

        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));


        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(160,96,150,100);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        radiobutton1 = new JRadioButton();
        radiobutton1.setBounds(14,10,90,35);
        radiobutton1.setBackground(new Color(214,217,223));
        radiobutton1.setForeground(new Color(0,0,0));
        radiobutton1.setEnabled(true);
        radiobutton1.setFont(new Font("sansserif",0,12));
        radiobutton1.setText("Dojizdi");
        radiobutton1.setVisible(true);
        
        //radiobutton1.addActionListener(new ActionListener()
        //{public void actionPerformed(ActionEvent evt){dojizdi(evt);}});

        radiobutton2 = new JRadioButton();
        radiobutton2.setBounds(15,39,90,35);
        radiobutton2.setBackground(new Color(214,217,223));
        radiobutton2.setForeground(new Color(0,0,0));
        radiobutton2.setEnabled(true);
        radiobutton2.setFont(new Font("sansserif",0,12));
        radiobutton2.setText("Domov ml");
        radiobutton2.setVisible(true);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(radiobutton1);
        bg1.add(radiobutton2);

        //adding components to contentPane panel
        contentPane.add(panel1);
        panel1.add(radiobutton1);
        panel1.add(radiobutton2);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project();
            }
        });
    }

}
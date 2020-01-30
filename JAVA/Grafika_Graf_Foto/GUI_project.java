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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JTextField textfield1;
    private JTextField textfield2;
    public double[] hodnoty;
    public String[] nazvy;
    int pocitadlo = 0;
    //Constructor 
    public GUI_project(int pocetp){

        this.setTitle("GUI_project");
        this.hodnoty = new double[pocetp];
        this.nazvy = new String[pocetp];
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPane = new JPanel(null);
        contentPane.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));


        button1 = new JButton();
        button1.setBounds(304,360,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Nacist Graf");
        button1.setVisible(true);
        
        button2 = new JButton();
        button2.setBounds(304,360,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Ulozit data do pole");
        button2.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(81,14,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Nazev");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(195,17,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Hodnota");
        label2.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(71,60,90,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(195,59,90,35);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);

        
        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(400, 400);
                f.add(new PieChart2(hodnoty, nazvy),BorderLayout.CENTER);
                f.setVisible(true);
            }
        }
    );
    
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                if((textfield1.getText().isEmpty()||textfield2.getText().isEmpty())&&(pocitadlo ==9))
                {
                    System.out.println("Nezadaly jste obě hodnoty");
                }
                else
                {
                    nazvy[pocitadlo] = textfield1.getText();
                    hodnoty[pocitadlo] = Double.valueOf(textfield2.getText());
                    pocitadlo++;
                }
            }
        }
    );

        //adding components to contentPane panel
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPane.add(button2,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPane.add(button1,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPane.add(label1,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPane.add(label2,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPane.add(textfield1,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(textfield2,gbc);

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
                new GUI_project(10);
            }
        });
    }

}
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
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jdesktop.swingx.*;
import java.text.DateFormat;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
public class GUI extends JFrame {

    private JMenuBar menuBar;
    private JTextField textfield1;
    private JButton button1;
    private JComboBox combobox1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JRadioButton radiobutton1;
    private JRadioButton radiobutton2;
    private JTextField textfield2;
    private org.jdesktop.swingx.JXDatePicker picker;
    private String jmeno;
    private String prijmeni;
    private String as;
    private String os;
    public GUI(){

        this.setTitle("Dotazník");
        this.setSize(500,400);
        this.setResizable(false);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));
        GridBagLayout layout = new GridBagLayout();
        contentPane.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        picker = new org.jdesktop.swingx.JXDatePicker();
        picker.setBackground(Color.BLUE);
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy")); //$NON-NLS-1$
        picker.setSize(200,40);
        picker.setVisible(true);
        picker.setLocation(196,205);
        
        textfield1 = new JTextField();
        textfield1.setBounds(84,30,90,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        button1 = new JButton();
        button1.setBounds(41,250,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Odeslat");
        button1.setVisible(true);
        
        combobox1 = new JComboBox();
        combobox1.setBounds(136,166,90,35);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);
        combobox1.addItem("Fotbal");
        combobox1.addItem("Hokej");
        combobox1.addItem("Tenis");
        combobox1.addItem("Biatlon");
        combobox1.addItem("Florbal");

        label1 = new JLabel();
        label1.setBounds(15,28,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Jméno");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(12,68,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Pøíjmení");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(13,100,190,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Jste aktivni sportovec");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(17,169,120,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Váš oblíbený sport");
        label4.setVisible(true);
        
        label5 = new JLabel();
        label5.setBounds(17,210,190,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Kdy zaènete/jste zaèal sportovat:");
        label5.setVisible(true);
        
        ButtonGroup bg;
        bg = new ButtonGroup();
        radiobutton1 = new JRadioButton();
        radiobutton1.setBounds(19,125,90,35);
        radiobutton1.setBackground(new Color(192,192,192));
        radiobutton1.setForeground(new Color(0,0,0));
        radiobutton1.setEnabled(true);
        radiobutton1.setFont(new Font("sansserif",0,12));
        radiobutton1.setText("Ano");
        radiobutton1.setVisible(true);

        radiobutton2 = new JRadioButton();
        radiobutton2.setBounds(114,126,80,35);
        radiobutton2.setBackground(new Color(192,192,192));
        radiobutton2.setForeground(new Color(0,0,0));
        radiobutton2.setEnabled(true);
        radiobutton2.setFont(new Font("sansserif",0,12));
        radiobutton2.setText("Ne");
        radiobutton2.setVisible(true);
        
        bg.add(radiobutton1);
        bg.add(radiobutton2);
        
        textfield2 = new JTextField();
        textfield2.setBounds(84,67,90,35);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);
        //adding components to contentPane panel
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
        contentPane.add(label1,gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.gridwidth = 3;
        contentPane.add(textfield1,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 1;
        contentPane.add(label2,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.gridwidth = 3;
        contentPane.add(textfield2,gbc);
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 2;gbc.anchor = GridBagConstraints.SOUTHWEST;
        contentPane.add(label3,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.SOUTHWEST;
        contentPane.add(radiobutton1,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 3;
    gbc.gridy = 2;
        contentPane.add(radiobutton2,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;gbc.gridx = 0;gbc.gridy = 3;
        contentPane.add(label4,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;gbc.gridy = 3;gbc.gridwidth = 3;
        contentPane.add(combobox1,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;gbc.gridy = 4;gbc.gridwidth = 1;
        contentPane.add(label5,gbc);
        gbc.gridx = 1;gbc.gridy = 4;gbc.gridwidth = 3;
        contentPane.add(picker,gbc);
        gbc.gridx = 0;gbc.gridy = 5;gbc.gridwidth = 5;
        contentPane.add(button1,gbc);
    

        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jmeno = textfield1.getText();
            prijmeni = textfield2.getText();
            if(radiobutton1.isSelected()){ as = "Ano"; }
            else if(radiobutton2.isSelected()){ as = "Ne";}
            else{ as = "error";}
            
            if((jmeno == "" || jmeno.isEmpty()) || (prijmeni.isEmpty() || prijmeni == "")|| (as == "error"))
            {
                System.out.println("Nejsou vyplnìny všechny informace!");
            }
            else
            {
                    JFormattedTextField editor = picker.getEditor();
                    Date dateInDatePicker = (Date) editor.getValue();
                    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
                    String dn = dateFormat.format(dateInDatePicker);
                    os = String.valueOf(combobox1.getSelectedItem());
                    Prepravka pr = new Prepravka(jmeno,prijmeni,as,os,dn);
                    System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new GUI2(pr);
                    }
                });
            }
        }
    });
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
                new GUI();
            }
        });
    }

}
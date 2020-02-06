/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.sql.*;
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
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Zaloha extends JFrame 
{
    private JMenuBar menuBar;
    private JButton button1;
    private JComboBox combobox1;
    private JLabel label1;
    private static Connection conn;
    static JTable table;
    String conString = "jdbc:sqlite:chinook.db";
    String[] columnNames = {"Roll No", "Name", "Class", "Section"};
    //Constructor 
    public Zaloha()
    {
        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(220,8,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("OK");
        button1.setVisible(true);

        String[] obsah = {"Žánr","Kapela","Album","Pisen","Vše"};
        combobox1 = new JComboBox(obsah);
        combobox1.setBounds(60,8,155,35);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);
        
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        //DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
        //table = new JTable(model);
        table = new JTable();
        table.setModel(model); 
        //table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(500,400));
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 

        label1 = new JLabel();
        label1.setBounds(8,8,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Vypsat");
        label1.setVisible(true);
        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(combobox1);
        contentPane.add(label1);
        contentPane.add(scroll);
        contentPane.add(table);
        vytvorUdalosti();
        //adding panel to JFrame and seting of window position and close operation
        //this.add(contentPane);
        this.add(label1);
        this.add(button1);
        this.add(combobox1);
        this.add(scroll);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    private void vytvorUdalosti()
    {
        button1.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
                connect();
                String sqlQuery;
                String vyber;
                switch(combobox1.getSelectedIndex())
                {
                    case 0: vyber = "Žánr"; break;
                    case 1: vyber = "Kapela"; break;
                    case 2: vyber = "Album"; break;
                    case 3: vyber = "Pisen"; break;    
                    default: vyber = "default"; break; 
                }
                int colum;
                switch(vyber)
                {
                    case "Žánr": sqlQuery ="SELECT genres.name as 'info' from genres"; colum = 1; String[] nazvy = {"žánr"}; ShowTableData(sqlQuery,colum,nazvy); break;
                    case "Kapela": sqlQuery ="SELECT artists.name as 'info' from artists"; colum = 2; String[] nazvyb = {"název_skupiny"}; ShowTableData(sqlQuery,colum,nazvyb); break;
                    case "Album": sqlQuery ="SELECT albums.title as 'info' from albums"; colum = 3; String[] nazvyc = {"název_alba"};ShowTableData(sqlQuery,colum,nazvyc); break;
                    case "Pisen": sqlQuery ="SELECT tracks.name as 'info' from tracks"; colum = 4; String[] nazvyd = {"název_skladby"};ShowTableData(sqlQuery,colum,nazvyd); break;
                    default: sqlQuery ="SELECT genres.name as 'info' from genres"; colum = 5; String[] nazvye = {"žánr", "název_skupiny", "název_alba", "název_skladby"};ShowTableData(sqlQuery,colum,nazvye); break;
                }
                
            }  
        });  
    }
    
    public static void connect() 
    {
        conn = null;
        try 
        {
            String conString = "jdbc:sqlite:chinook.db";
            // create a connection to the database
            conn = DriverManager.getConnection(conString);            
            //System.out.println("Připojení k databázi SQLite bylo zřízeno");       
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        } 
        finally 
        {
    
        }
    }

    public void ShowTableData(String query,int colum,String[] nazvy)
    {
        connect();
        String[] columnNames = {"žánr", "název_skupiny", "název_alba", "název_skladby"};
        PreparedStatement pst;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        String zanr = "";
        String nskupiny = "";
        String nalba = "";
        String nskladby = "";
        try {
            pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            //int i = 0;
            while (rs.next()) {
                switch(colum)
                {
                    case 5: zanr = rs.getString("žánr");
                            nskupiny = rs.getString("název_skupiny");
                            nalba = rs.getString("název_alba");
                            nskladby = rs.getString("název_skladby");
                            model.addRow(new Object[]{zanr, nskupiny, nalba, nskladby}); break;
                    default: zanr = rs.getString("info");
                             model.addRow(new Object[]{zanr}); break;
                }
                //i++;
            }
            /*if (i < 1) {JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);} 
            if (i == 1) { System.out.println(i + " Record Found");} else {System.out.println(i + " Records Found"); }*/
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        table.setModel(model);
    }
    
    //method for generate menu
    public void generateMenu()
    {
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

     public static void main(String[] args)
     {
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Zaloha();
            }
        });
    }
}
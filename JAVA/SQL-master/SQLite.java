import java.sql.*;
/*Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;*/
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class SQLite extends JFrame
{
    JFrame frame1;
    private static Connection conn;
    static JTable table;
    
    String[] columnNames = {"User name", "Email", "Password", "Country"};
    PreparedStatement pst;
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
    
    public static void query(String select)
    {
        String sqlQuery;
        int colum;
        switch(select)
        {
            case "Žánr": sqlQuery ="SELECT genres.name as 'info' from genres"; colum = 1; String[] nazvy = {"žánr"}; ShowTableData(sqlQuery,colum,nazvy); break;
            case "Kapela": sqlQuery ="SELECT artists.name as 'info' from artists"; colum = 2; String[] nazvyb = {"název_skupiny"}; ShowTableData(sqlQuery,colum,nazvyb); break;
            case "Album": sqlQuery ="SELECT albums.title as 'info' from albums"; colum = 3; String[] nazvyc = {"název_alba"};ShowTableData(sqlQuery,colum,nazvyc); break;
            case "Pisen": sqlQuery ="SELECT tracks.name as 'info' from tracks"; colum = 4; String[] nazvyd = {"název_skladby"};ShowTableData(sqlQuery,colum,nazvyd); break;
            default: sqlQuery ="SELECT genres.name as 'info' from genres"; colum = 5; String[] nazvye = {"žánr", "název_skupiny", "název_alba", "název_skladby"};ShowTableData(sqlQuery,colum,nazvye); break;
        }
        /*try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sqlQuery))
        {
            // loop through the result set
            while (rs.next()) 
            {
                System.out.println(rs.getString("info"));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        finally 
        {
            try 
            {
                if (conn != null) 
                {
                    conn.close();
               }
            } 
            catch (SQLException ex) 
            {
                System.out.println(ex.getMessage());
            }
        }*/
    }
    
    public static void ShowTableData(String query,int colum,String[] nazvy)
    {
        JFrame frame1;
        JTextField textfield1;
        frame1 = new JFrame("Databáze - dotaz");
        
        String[] columnNames = {"žánr", "název_skupiny", "název_alba", "název_skladby"};
        PreparedStatement pst;
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(nazvy); 
        //DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames());
        //table = new JTable(model);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //String textvalue = textbox.getText();´
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
        frame1.add(scroll);
        frame1.setVisible(true);

        frame1.setSize(400, 300);

    }
    
    public static void selectAll()
    {
        //String sqlQuery = "select * from albums";
        String sqlQuery ="SELECT genres.name as 'žánr',artists.name as 'název_skupiny',"+
        "albums.title as 'název_alba', tracks.name as 'název_skladby' "+
        "from genres,artists, albums,tracks where genres.genreID=tracks.genreID "+
        "and tracks.albumID=albums.albumID and albums.artistID=artists.artistID "+
        "order by  žánr, název_skupiny ";
        String[] nazvy = {"žánr", "název_skupiny", "název_alba", "název_skladby"};
        ShowTableData(sqlQuery,5,nazvy);
        /*String jmeno = "Novák";
        String sqlQuery = "INSERT INTO artists VALUES '"+jmeno+"'";*/
        /*try (Statement stmt  = conn.createStatement(); ResultSet rs    = stmt.executeQuery(sqlQuery))
        {
            // loop through the result set
            while (rs.next()) 
            {
                System.out.println(rs.getString("žánr") +  "\t" + 
                                   rs.getString("název_skupiny") +"\t"+
                                   rs.getString("název_alba") +"\t"+
                                   rs.getString("název_skladby")); 
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        finally 
        {
            try 
            {
                if (conn != null) 
                {
                    conn.close();
               }
            } 
            catch (SQLException ex) 
            {
                System.out.println(ex.getMessage());
            }
        }*/
    }
    
    public static void main(String[] args) {
        connect();
        selectAll();
    }
}
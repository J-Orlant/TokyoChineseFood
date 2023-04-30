package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author idaba
 */
public class Koneksi {
    static private Connection koneksi = null;
    public static Connection koneksiDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi =  DriverManager.getConnection("jdbc:mysql://localhost/lsp", "root", "");
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

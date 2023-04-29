package Views;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierPage extends JFrame{

    private JPanel panel;
    private JLabel TitlePageLabel;
    private JLabel TitleMenuLabel;
    private JTable ListPesananSelesai;
    private JList ListItemPembelian;
    private JTextField UangBayarTextField;
    private JButton prosesButton;
    private JButton konfirmasiButton;
    private JLabel UangLabel;
    private JLabel KembalianLabel;
    private JLabel NamaLabel;
    private JLabel TotalLabel;
    private JLabel ListMenuLabel;
    private JLabel DetailLabel;
    private JLabel MejaLabel;
    private JLabel IsiNamaLabel;
    private JLabel IsiMejaLabel;
    private JLabel IsiTotalLabel;
    private JLabel isiKembalianLabel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public CashierPage(){

        ListPesananSelesai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String Nama = {ListPesananSelesai}.getValueAt({ListPesananSelesai}, 1).toString();
                String Meja = {ListPesananSelesai}.getValueAt({ListPesananSelesai}, 2).toString();
                String IdPesanan = {ListPesananSelesai}.getValueAt({ListPesananSelesai}, 3).toString();

                IsiNamaLabel.setText(Nama);
                IsiMejaLabel.setText(Meja);
            }
        });
    }

    public static void main(String[] args) {
        CashierPage c = new CashierPage();
        c.setContentPane(c.panel);
        c.setSize(500, 500);
        c.setVisible(true);
        c.setTitle("Tokyo Chinesse Food");
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

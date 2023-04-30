/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiRestoran;

import AplikasiRestoran.admin.AdminPanel;
import AplikasiRestoran.auth.LoginForm;
import AplikasiRestoran.cashier.CashierPanel;
import AplikasiRestoran.waiter.WaiterPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import AplikasiRestoran.auth.User;
import AplikasiRestoran.owner.OwnerPanel;
import Models.Menu;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author idaba
 */
public class MainFrame extends javax.swing.JFrame {
    private Statement st;
    private ResultSet rs;
    private DefaultTableModel tabModel;
    private DefaultTableModel tabModelPesanan;
    private DefaultTableModel tabModelKeranjang;
    private Connection cn = Koneksi.Koneksi.koneksiDB();

    private User user = new User();
//    public static ArrayList<Menu> menuArrayList = new ArrayList<Menu>();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        getAllMenu();
        initComponents();
    }

    private void getAllMenu() {
//        try {
//            st = cn.createStatement();
//
//            rs = st.executeQuery("SELECT * FROM menu");
//
//            while (rs.next()) {
//                menuArrayList.add(new Menu(
//                        rs.getString("id"),
//                        rs.getString("nama_menu"),
//                        Integer.parseInt(rs.getString("harga")),
//                        Integer.parseInt(rs.getString("stok"))
//                ));
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 772));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jMenu1.setText("LOGIN / MASUK");

        menuLogin.setText("LOGIN");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogin);

        menuLogout.setText("LOGOUT");
        menuLogout.setEnabled(false);
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogout);

        menuExit.setText("EXIT");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        desktopPane.removeAll();
        LoginForm lf = new LoginForm();
        lf.setVisible(true);

        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = lf.getSize();
        lf.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                (desktopSize.height- jInternalFrameSize.height)/2);

        desktopPane.add(lf);
        menuLogin.setEnabled(false);
        menuLogout.setEnabled(true);
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int pilih = JOptionPane.showConfirmDialog(this, "Keluar aplikasi ?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        
        if(pilih == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        AdminPanel ap = new AdminPanel(user);
        WaiterPanel wp =  new WaiterPanel(user);
        CashierPanel cp =  new CashierPanel(user);
        OwnerPanel op =  new OwnerPanel(user);
        ap.setVisible(false);
        wp.setVisible(false);
        cp.setVisible(false);
        op.setVisible(false);
        desktopPane.removeAll();
        menuLogout.setEnabled(false);
        menuLogin.setEnabled(true);

    }//GEN-LAST:event_menuLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuLogout;
    // End of variables declaration//GEN-END:variables
}

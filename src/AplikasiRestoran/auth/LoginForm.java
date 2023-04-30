/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiRestoran.auth;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import AplikasiRestoran.admin.AdminPanel;
import AplikasiRestoran.waiter.WaiterPanel;
import AplikasiRestoran.cashier.CashierPanel;
import AplikasiRestoran.auth.User;

import AplikasiRestoran.MainFrame;
import static AplikasiRestoran.auth.Sha1.sha1;
import AplikasiRestoran.owner.OwnerPanel;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author idaba
 */
public class LoginForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("LOGIN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        User user;
        Connection conn =  Koneksi.Koneksi.koneksiDB();
        try {
            Statement st = conn.createStatement();
            String sql =  "SELECT * FROM users WHERE email='"+ email.getText() +"' and password='"+ sha1(password.getText()) +"'";
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()) {
                user = new User(rs.getString("name"),rs.getString("email"),rs.getString("level"));
                if(rs.getString("level").equals("ADMIN")) {
                    JOptionPane.showMessageDialog(this, "Login Berhasil!!");
                    AdminPanel ap =  new AdminPanel(user);
                    ap.setVisible(true);
                    this.getDesktopPane().add(ap);
                } else if(rs.getString("level").equals("WAITER")){
                    JOptionPane.showMessageDialog(this, "Login Berhasil!!");
                    WaiterPanel wp = new WaiterPanel(user);
                    wp.setVisible(true);
                    this.getDesktopPane().add(wp);
                } else if(rs.getString("level").equals("CASHIER")){
                    JOptionPane.showMessageDialog(this, "Login Berhasil!!");
                    CashierPanel cp = new CashierPanel(user);
                    cp.setVisible(true);
                    this.getDesktopPane().add(cp);
                } else if(rs.getString("level").equals("OWNER")){
                    JOptionPane.showMessageDialog(this, "Login Berhasil!!");
                    OwnerPanel op = new OwnerPanel(user);
                    op.setVisible(true);
                    this.getDesktopPane().add(op);
                }

                this.dispose();
            } else {
                    JOptionPane.showMessageDialog(this, "Email atau Password salah!!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}

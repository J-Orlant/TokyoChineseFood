package Views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class RegisFrame extends JInternalFrame {

    private JPanel panelDasar = new JPanel();
    private JLabel headerLabel = new JLabel("REGISTER");

    private JPanel centerJPanel = new JPanel(new GridLayout(3,2));

    private JLabel usernameLabel = new JLabel("Username");
    private JLabel passwordJLabel = new JLabel("Password");
    private JLabel confirmPassJLabel = new JLabel("Confirm Password");

    private JTextField usernameField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JPasswordField confirmPasswordField = new JPasswordField();

    private JPanel footerJPanel = new JPanel();
    private JButton submitBtn = new JButton("Register");
    private JLabel insertJLabel = new JLabel();

    public JButton setSubmitBtn(JButton submitBtn) {
        this.submitBtn = submitBtn;
        submitBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = usernameField.getText();
                insertJLabel.setText("Hello " + name);
            }
        });
        return submitBtn;
    }

    public RegisFrame() {
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER); //biar ketengah labelny
        panelDasar.add(headerLabel, BorderLayout.NORTH); //naro label login di atas

        centerJPanel.add(usernameLabel);
        centerJPanel.add(usernameField);
        centerJPanel.add(passwordJLabel);
        centerJPanel.add(passwordField);
        centerJPanel.add(confirmPassJLabel);
        centerJPanel.add(confirmPasswordField);
        panelDasar.add(centerJPanel);

        footerJPanel.add(setSubmitBtn(submitBtn));
        footerJPanel.add(insertJLabel);
        panelDasar.add(footerJPanel, BorderLayout.SOUTH); //naro tombol submit dibawah

        panelDasar.setSize(500, 500);
        this.setSize(500, 500);

        this.add(panelDasar);
    }

//    public static void main(String[] args) {
//        new RegisFrame();
//    }
}

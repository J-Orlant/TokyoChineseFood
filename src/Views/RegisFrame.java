package Views;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisFrame extends JFrame{

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

    public RegisFrame() {
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER); //biar ketengah labelny
        add(headerLabel, BorderLayout.NORTH); //naro label login di atas

        centerJPanel.add(usernameLabel);
        centerJPanel.add(usernameField);
        centerJPanel.add(passwordJLabel);
        centerJPanel.add(passwordField);
        centerJPanel.add(confirmPassJLabel);
        centerJPanel.add(confirmPasswordField);
        add(centerJPanel);

        footerJPanel.add(submitBtn);
        add(footerJPanel, BorderLayout.SOUTH); //naro tombol submit dibawah

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegisFrame();
    }   
}

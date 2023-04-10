package Views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{
    // Khusus untuk membuat isian dari panelnya

    private JLabel emaillabel = new JLabel("Enter your email: ");
    private JTextField useremail = new JTextField(25);
    

    private JLabel passlabel = new JLabel("Enter your password: ");
    private JPasswordField userpass = new JPasswordField(10);

    private JButton loginbutton = new JButton("Login");
    

    // Masukin semua panelnya
    public LoginFrame(){
        JPanel newPanel = new JPanel();

        loginbutton.addActionListener(this);

        newPanel.add(emaillabel);
        newPanel.add(useremail);
        newPanel.add(passlabel);
        newPanel.add(userpass);
        newPanel.add(loginbutton);

        // Panel dimasukin ke Frame
        add(newPanel);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String UserEmail = useremail.getText();
        String UserPass = userpass.getText();

        System.out.println("Your User Email is: " + UserEmail);
        System.out.println("Your Password is: " + UserPass);
    }
}


package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JButton loginButton;
    private JPanel panel;
    private JTextField usernameTextF;
    private JPasswordField passwordTextF;
    private JButton cancelButton;
    private JLabel passwordLabel;
    private JLabel usernameLabel;
    private JLabel loginTitle;

    public LoginPage() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String UserEmail = usernameTextF.getText();
                String UserPass = passwordTextF.getText();

                System.out.println("Your User Email is: " + UserEmail);
                System.out.println("Your Password is: " + UserPass);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        LoginPage l = new LoginPage();
        l.setContentPane(l.panel);
        l.setSize(500, 500);
        l.setVisible(true);
        l.setTitle("Tokyo Chinesse Food");
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

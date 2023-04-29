package Controllers;

import Models.Users.Cashier;
import Models.Users.User;
import Models.Users.Waiter;
import Views.CashierFrame;
import Views.CashierPage;
import Views.LoginFrame;
import Views.WaiterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AuthController {
    private User model;
    private JInternalFrame view;

    public AuthController (User model, JInternalFrame view) {
        this.model = model;
        this.view = view;
    }

    public void showView(JDesktopPane mainFrame) {
        view.setVisible(true);
        mainFrame.add(view);
    }

    public void login(ArrayList<User> userArrayList, JDesktopPane mainFrame) {
        LoginFrame frame = (LoginFrame)view;
        frame.getActionButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userEmail = frame.getUsername().getText();
                String userPass = frame.getPassword().getText();
                System.out.println(userPass + " " + userEmail);

                boolean isValid = false;
                for (User user: userArrayList) {
//                    System.out.println(user.getNama() + " == " + userEmail + ", " + user.getPassword() + " == " + userPass);
                    if(userEmail.equals(user.getEmail()) && userPass.equals(user.getPassword())) {
                        isValid = true;
                        System.out.println("Hola");
                        if(user instanceof Cashier) {
//                            ((Cashier) model).setCashier((Cashier) user);
                            CashierFrame cashierFrame = new CashierFrame();

                            mainFrame.removeAll();

                            cashierFrame.setVisible(true);
                            mainFrame.add(cashierFrame);
                            break;
                        }
                        if(user instanceof Waiter) {
                            WaiterFrame waiterFrame = new WaiterFrame();

                            mainFrame.removeAll();

                            waiterFrame.setVisible(true);
                            mainFrame.add(waiterFrame);
                            break;
                        }

                    }
                }

                if(!isValid) {
                    JOptionPane.showMessageDialog(mainFrame, "Email / Password Salah");
                }
            }
        });
    }
}

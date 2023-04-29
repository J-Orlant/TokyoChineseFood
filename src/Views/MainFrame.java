package Views;

import Controllers.AuthController;
import Models.DataBaseRes;
import Models.Users.Cashier;
import Models.Users.User;
import Models.Users.Waiter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JDesktopPane mainFrame;
    private JMenu authMenu;
    private JMenuBar topBar;

    private DataBaseRes dataBaseRes = new DataBaseRes();
    public MainFrame() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        initDekstopPane();
        initTopBar();

        this.setVisible(true);
    }

    private void initTopBar() {
        topBar = new JMenuBar();
        authMenu = new JMenu();

        authMenu.setText("Login / Register");
        String authMenuText[] = {
                "Login", "Register", "Logout", "Exit"
        };

        ActionListener authFunction[] = new ActionListener[]{new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    showLoginPage(event);
                }
            },
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showRegisterPage(e);
                }
            }
        };


        for(String menu: authMenuText) {
            authMenu.add(new JMenuItem(menu));
        }

        authMenu.getItem(0).addActionListener(authFunction[0]);
        authMenu.getItem(1).addActionListener(authFunction[1]);


        authMenu.getItem(2).setEnabled(false);

        topBar.add(authMenu);
        setJMenuBar(topBar);
    }

    private void initDekstopPane() {
        this.mainFrame = new JDesktopPane();

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
                desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 919, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
                desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 741, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainFrame)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainFrame)
        );

        pack();
    }

    private void showLoginPage(ActionEvent event) {
        User user = new Waiter();
        LoginFrame loginFrame = new LoginFrame();
        AuthController controller = new AuthController(user, loginFrame);

        this.mainFrame.removeAll();
        controller.showView(mainFrame);
        controller.login(dataBaseRes.getUserArrayList(), mainFrame);

        this.authMenu.getItem(0).setEnabled(false);
    }
    private void showRegisterPage(ActionEvent event) {
        this.mainFrame.removeAll();

        RegisFrame regisFrame = new RegisFrame();
        regisFrame.setVisible(true);

        this.mainFrame.add(regisFrame);
        this.authMenu.getItem(1).setEnabled(false);
    }

    private void logout(ActionEvent event) {
    }

    private void exit(ActionEvent event) {
        int pilih = JOptionPane.showConfirmDialog(null, "Keluar aplikasi ?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if(pilih == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.getRootFrame();
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }

}

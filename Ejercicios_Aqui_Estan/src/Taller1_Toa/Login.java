package Taller1_Toa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JTextField txtUser;
    private JPasswordField txtPassword;
    private JButton accederButton;
    private JPanel formLogin;

    public Login () {
        setContentPane(formLogin);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,300);
        accederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = "Toto007", pass= "tgma007";
                String us= txtUser.getText(),ps=txtPassword.getText();
                if (user.equals(us)&&pass.equals(ps)) {
                    JOptionPane.showMessageDialog(null,"INGRESO EXITOSO");
                    dispose();
                    new Bienvenido();
                }else{
                    JOptionPane.showMessageDialog(null,"INGRESO FALLIDO");
                    txtPassword.setText("");
                    txtUser.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}

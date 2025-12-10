package Clase11_POO_Toaquiza.Taller.Taller1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Clase11_POO_Toaquiza.Taller.Taller1.Main.listaUsuarios;


public class Login extends JFrame{
    private JTextField txtUse;
    private JTextField txtPass;
    private JButton ingresarButton;
    private JButton registrarButton;
    private JPanel login_panel;
    public Login () {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre=txtUse.getText(), pass=txtPass.getText();
                boolean encontrado=false;
                for (Usuario u: listaUsuarios){
                    if (u.getUsuario() ==nombre && u.getClave() ==pass) {
                        encontrado=true;
                    }
                }
                if(!encontrado){
                    txtPass.setText("");
                    txtUse.setText("");
                    JOptionPane.showMessageDialog(null,"USUARIO O CLAVE INCORRECTOS");
                }else{
                    JOptionPane.showMessageDialog(null,"INGRESO EXISTOSO");
                    new BancoPrincipal();
                    Login.this.dispose();
                }
            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login.this.dispose();
                new Registro();
            }
        });
        setContentPane(login_panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setTitle("Banco Togma-Bryan S.A");
    }

    public static void main() {
        new Login();
    }
}

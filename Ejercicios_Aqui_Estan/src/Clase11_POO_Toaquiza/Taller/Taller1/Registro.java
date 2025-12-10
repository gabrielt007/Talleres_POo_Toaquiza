package Clase11_POO_Toaquiza.Taller.Taller1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Clase11_POO_Toaquiza.Taller.Taller1.Main.listaUsuarios;

public class Registro extends JFrame{
    private JTextField txtUser;
    private JTextField txtClave;
    private JTextField txtMonto;
    private JPanel registro_panel;
    private JPanel registro;
    private JButton registrarButton;

    public Registro () {
        setContentPane(registro);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Registro Banco Togma-Bryan");
        setSize(400,270);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String nombre=txtUser.getText(), clave=txtClave.getText();
                    double monto=Double.parseDouble(txtMonto.getText());
                    listaUsuarios.add(new Usuario(nombre,clave,monto));
                    JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO");
                    new BancoPrincipal();
                    Registro.this.dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Monto inválido. Ingresa un número válido.");
                    txtMonto.setText("");
                } catch (DatoInvalidoExcepcion ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    txtUser.setText("");
                    txtClave.setText("");
                    txtMonto.setText("");
                }


            }
        });
    }

}

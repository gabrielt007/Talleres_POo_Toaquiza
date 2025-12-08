package Taller1_Toa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenido extends JFrame {
    private JPanel panel1;
    private JTextField valor1;
    private JTextField valor2;
    private JButton sumaButton;
    private JButton restaButton;
    private JButton multiplicacionButton;
    private JButton divisionButton;
    private JLabel respuesta;

    public Bienvenido () {
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,250);
        setTitle("Bienvenida");
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1=Double.parseDouble(valor1.getText()),num2=Double.parseDouble(valor2.getText());
                    double suma = num1+num2;
                    respuesta.setText("=== "+suma+" ===");
                }catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null,"Ingresa valores validos.");
                }

            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1=Double.parseDouble(valor1.getText()),num2=Double.parseDouble(valor2.getText());
                    double resta = num1-num2;
                    respuesta.setText("=== "+resta+" ===");
                }catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null,"Ingresa valores validos.");
                }
            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1=Double.parseDouble(valor1.getText()),num2=Double.parseDouble(valor2.getText());
                    double multiplicacion = num1*num2;
                    respuesta.setText("=== "+multiplicacion+" ===");
                }catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null,"Ingresa valores validos.");
                }
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1=Double.parseDouble(valor1.getText()),num2=Double.parseDouble(valor2.getText());
                    double division = num1/num2;
                    respuesta.setText("=== "+division+" ===");
                }catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null,"Ingresa valores validos.");
                }
            }
        });
    }
}

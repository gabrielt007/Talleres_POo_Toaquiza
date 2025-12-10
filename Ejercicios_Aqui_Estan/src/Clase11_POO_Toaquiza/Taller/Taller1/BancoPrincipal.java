package Clase11_POO_Toaquiza.Taller.Taller1;

import javax.swing.*;

import static Clase11_POO_Toaquiza.Taller.Taller1.Main.listaUsuarios;

public class BancoPrincipal extends JFrame{
    private JButton depositoButton;
    private JButton salirButton;
    private JButton retiroButton;
    private JButton transferenciaButton;
    private JPanel Banca;
    private JLabel saldo;
    private JLabel usuario;

    public BancoPrincipal(AccionesBancarias usuarioIngresado){
        setContentPane(Banca);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        saldo.setText(String.valueOf(usuarioIngresado.getSaldo()));
        usuario.setText(usuarioIngresado.getNombre());
        depositoButton.addActionListener(e -> {
            try {
                double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto a depositar: $"));
                if (monto > 0) {
                    usuarioIngresado.deposito(monto);
                } else {
                    JOptionPane.showMessageDialog(null, "Monto invalido", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Ingresaste una letra","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        retiroButton.addActionListener(e -> {
            try{
                double monto=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto: $"));
                if (monto>Double.parseDouble(saldo.getText())||monto<0){
                    JOptionPane.showMessageDialog(null, "Monto invalido", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else{
                    usuarioIngresado.retiro(monto);
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Monto invalido","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        transferenciaButton.addActionListener(e -> {
            try{
                double monto=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto: $"));
                String destinatario=JOptionPane.showInputDialog("Ingresa el destinatario: ");
                if (monto>Double.parseDouble(saldo.getText())||monto<0){
                    JOptionPane.showMessageDialog(null, "Monto invalido", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else if(destinatario.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Usuario vacio", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else{
                    for(Usuario u:listaUsuarios){
                        if (u.getUsuario().equals(destinatario)){
                            usuarioIngresado.transferir(monto,destinatario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "ERROR", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Monto invalido","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        salirButton.addActionListener(e -> {
            dispose();
            new Login();
        });
    }
}

package Clase11_POO_Toaquiza.Taller.Taller1;

import javax.swing.*;

public class BancoPrincipal extends JFrame{
    private JButton depositoButton;
    private JButton salirButton;
    private JButton retiroButton;
    private JButton transferenciaButton;
    private JPanel Banca;
    private JLabel saldo;
    private JLabel usuario;

    public BancoPrincipal(){
        setContentPane(Banca);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        //saldo.setText();
        depositoButton.addActionListener(e -> {
            try {
                double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto a depositar: $"));
                if (monto > 0) {
                    //LLAMAR A DEPOSITO
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
                    //LLAMAR RETIRAR
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Monto invalido","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        transferenciaButton.addActionListener(e -> {
            try{
                double monto=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto: $"));
                String usuario=JOptionPane.showInputDialog("Ingresa el destinatario: ");
                if (monto>Double.parseDouble(saldo.getText())||monto<0){
                    JOptionPane.showMessageDialog(null, "Monto invalido", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else if(usuario.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Usuario vacio", "ERROR", JOptionPane.WARNING_MESSAGE);
                    //if (VALIDAR USUARIO VS USUARIO EXISTENTE){
                        //LLAMAR Transferir
                    // }else{
                        //JOptionPane.showMessageDialog(null, "Usuario no encontrado", "ERROR", JOptionPane.WARNING_MESSAGE);
                    // }
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Monto invalido","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        salirButton.addActionListener(e -> {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            //LLAMAR A LOGIN
        });
    }

    public static void main(String[] args){
        new BancoPrincipal();
    }
}

package Clase11_POO_Toaquiza.Taller.Taller1;

public class AccionesBancarias {
    private double saldo;
    private String nombre;
    public AccionesBancarias(double saldo,String nombre){
        this.nombre=nombre;
        this.saldo=saldo;
    }

    public void deposito(double monto){
        if (monto>0){
            saldo+=monto;
        }
    }

    public void retiro(double monto){
        if (monto>saldo||monto<=0){
            return;
        }
        saldo-=monto;
    }

    public void transferir(double monto,String usuarioTranferencia){
        if (monto>0 && monto<=saldo){
            //VALIDACIONES DE TRANSFERENCIA
        }
    }
}

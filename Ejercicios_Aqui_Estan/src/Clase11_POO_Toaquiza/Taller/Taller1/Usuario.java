package Clase11_POO_Toaquiza.Taller.Taller1;

public class Usuario {
    private String usuario, clave;
    private double monto;

    public Usuario (String usuario,String clave, double monto) throws DatoInvalidoExcepcion {
        if (usuario.isEmpty() || usuario.length() < 4) throw new DatoInvalidoExcepcion("El usuario es invalido.");
        if (clave.isEmpty() || clave.length() < 4) throw new DatoInvalidoExcepcion("La clave es invalida.");
        if (monto <= 0) {throw new DatoInvalidoExcepcion("El monto es invalido.");}
        this.usuario=usuario;
        this.clave=clave;
        this.monto=monto;

    }

    public double getMonto() {
        return monto;
    }

    public String getClave() {
        return clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + ", Clave: " + clave + ", Monto: " + monto;
    }

}

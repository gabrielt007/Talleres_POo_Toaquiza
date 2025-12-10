package Clase11_POO_Toaquiza.Taller.Taller1.Usuarios_excepcion;

public class DatoInvalidoExcepcion extends RuntimeException {
    public DatoInvalidoExcepcion(String message) {
        super(message);
    }
}

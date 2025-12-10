package Clase11_POO_Toaquiza.Taller.Taller1;

import Clase11_POO_Toaquiza.Taller.Taller1.SistemaBancario.Login;
import Clase11_POO_Toaquiza.Taller.Taller1.Usuarios_excepcion.Usuario;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        new Login();
    }
}

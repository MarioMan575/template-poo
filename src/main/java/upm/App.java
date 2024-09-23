package upm;

import java.util.Scanner;

public class App {

    Jugador[] jugadores = new Jugador[999];

    public static void main(String[] args) {
        System.out.println("Run App..");
        
    }
    public static void altaJugador(){
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el nombre del jugador: ");
        nombre = teclado.nextLine();
        Jugador jugador = new Jugador(nombre);
        for (int i = 0; i < 100; i++) {
            if (condition) {
                
            }
        }

    }
}

package upm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("Luisa", 4.5);
        Jugador j2 = new Jugador("Manuel", 2.7);
        Jugador j3 = new Jugador("Kurt", 4.0);
        Jugador j4 = new Jugador ("Sofía", 3.8);
        Jugador j5 = new Jugador ("Robert", 3.8);
        Jugador.create(j1);
        Jugador.create(j2);
        Jugador.create(j3);
        Jugador.create(j4);
        Jugador.create(j5);
        System.out.println("-- BIENVENIDO, ELIJA QUE ACCION QUIERE REALIZAR --");
        System.out.println("    + Create [player]");
        System.out.println("    + Remove [player]");
        System.out.println("    + Mostrar");
        System.out.println("    + Rank ");
        System.out.println("    + Score [player] ; [score]");
        System.out.println("    + Show matchmake");
        System.out.println("    + Clear matchmake");
        System.out.println("    + Matchmake [player1] ; [player2]");
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();
        opcion.toLowerCase();
        switch (opcion) {
            case "create":
                String name = teclado.next();
                Jugador j = new Jugador(name, 0.0);
                Jugador.create(j);
                break;
            case "remove":
                String nombre = teclado.next();
                if (Jugador.estaAlta(nombre)) {
                    Jugador.remove(nombre);
                }
                break;
            case "show":
                System.out.println("Lista de jugadores: ");
                Jugador.show();
        
            default:
                break;
        }
    }
}

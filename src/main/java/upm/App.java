package upm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("Luisa", 4.5);
        Jugador j2 = new Jugador("Manuel", 2.7);
        Jugador j3 = new Jugador("Kurt", 4.0);
        Jugador j4 = new Jugador ("Sofía", 3.8);
        Jugador j5 = new Jugador ("Robert", 3.8);
        j1.darAlta(j5);
        System.out.println("-- BIENVENIDO, ELIJA QUE ACCION QUIERE REALIZAR --");
        System.out.println("    + Create [player]");
        System.out.println("    + Remove [player]");
        System.out.println("    + Show");
        System.out.println("    + Rank ");
        System.out.println("    + Score [player] ; [score]");
        System.out.println("    + Show matchmake");
        System.out.println("    + Clear matchmake");
        System.out.println("    + Matchmake [player1] ; [player2]");

    }
}

package upm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean salir = false;
        Jugador j1 = new Jugador("Luisa", 4.5);
        Jugador j2 = new Jugador("Manuel", 2.7);
        Jugador j3 = new Jugador("Kurt", 4.0);
        Jugador j4 = new Jugador ("Sofia", 3.8);
        Jugador j5 = new Jugador ("Roberto", 3.8);
        Jugador.create(j1);
        Jugador.create(j2);
        Jugador.create(j3);
        Jugador.create(j4);
        Jugador.create(j5);
        System.out.println("-- BIENVENIDO, ELIJA QUE ACCION QUIERE REALIZAR --");
        System.out.println("    + Create [player]");
        System.out.println("    + Remove [player]");
        System.out.println("    + Show");
        System.out.println("    + Rank ");
        System.out.println("    + Score [player] [score]");
        System.out.println("    + Show_matchmake");
        System.out.println("    + Clear_matchmake");
        System.out.println("    + Matchmake [player1] [player2]");
        System.out.println("    + Random matchmake");
        System.out.println("    + Teclea 'salir' para salir");
        Scanner teclado = new Scanner(System.in);
        while (!salir) {
            String opcion = teclado.next();
            switch (opcion.toLowerCase()) {
                case "create":
                    String name = teclado.next();
                    Jugador j = new Jugador(name, 0.0);
                    Jugador.create(j);
                    break;
                case "remove":
                    String nombre = teclado.next();
                    if (Jugador.estaAlta(nombre)) {
                        Jugador.remove(nombre);
                    }else{
                        System.out.println("El jugador no existe");
                    }
                    break;
                case "show":
                    System.out.println("Lista de jugadores: ");
                    Jugador.show();
                    break;
                case "rank":
                    System.out.println("Ranking de jugadores: ");
                    Jugador.ranck();
                    break;
                case "score":
                    String linea = teclado.nextLine();
                    String[] partes = linea.split(" ")[1].split(";");
                    String nombreJ = partes[0];
                    double score = Double.parseDouble(partes[1]);
                    Jugador.score(score, nombreJ);
                    break;
                case "show_matchmake":
                    Emparejamiento.showMatchmake();
                    break;
                case "clear_matchmake":
                    Emparejamiento.clearMatchmake();
                    break;
                case "matchmake":
                    Emparejamiento emparejamiento = new Emparejamiento();
                    String player1 = teclado.next();
                    String player2 = teclado.next();
                    Emparejamiento.matchmake(player1, player2);
                    break;
                case "random_matchmake":
                Emparejamiento emparejamiento2 = new Emparejamiento();
                    Emparejamiento.randomMatchmake();
                    break;
                case "salir":
                    System.out.println("Hasta luego");
                    salir = true;
                    break;
                default:
                    break;
                }
        }
    }
}

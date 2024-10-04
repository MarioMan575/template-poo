/**
 * Álvaro Fernández Abad (bu0290)
 * Mario Manzanares Gala (bu0377)
 * Sergio Marqués Andrés (bu0016)
 * Sergio Rodríguez Garrida (bu0041)
 */

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
        System.out.println("    + create [player]");
        System.out.println("    + remove [player]");
        System.out.println("    + show");
        System.out.println("    + rank");
        System.out.println("    + score [player];[score]");
        System.out.println("    + show_matchmake");
        System.out.println("    + clear_matchmake");
        System.out.println("    + matchmake [player1];[player2]");
        System.out.println("    + random_matchmake");
        System.out.println("    + Teclea 'salir' para salir");
        Scanner teclado = new Scanner(System.in);
        while (!salir) {
            System.out.print("> ");
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
                    Jugador.rank();
                    break;
                case "score":
                    //String linea = teclado.nextLine();
                    //String[] partes = linea.split(" ")[1].split(";");
                    //String nombreJ = partes[0];
                    //double score = Double.parseDouble(partes[1]);
                    //Jugador.score(score, nombreJ);
                    try{
                        String nombres1 = teclado.next();
                        String nombre3 = nombres1.split(";")[0];
                        try {
                            double score = Double.parseDouble(nombres1.split(";")[1]);
                            if (Jugador.estaAlta(nombre3)) {
                                Jugador.score(score, nombre3);
                            }else{
                                System.out.println("El jugador no existe");
                            }
                        }catch (NumberFormatException e){
                            System.out.println("Error en el formato de la puntuación");
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Error en el formato de la entrada");
                    }
                    break;
                case "show_matchmake":
                    Emparejamiento.showMatchmake();
                    break;
                case "clear_matchmake":
                    Emparejamiento.clearMatchmake();
                    break;
                case "matchmake":
                    Emparejamiento emparejamiento = new Emparejamiento();
                    try {
                        String nombres = teclado.next();
                        String player1 = nombres.split(";")[0];
                        String player2 = nombres.split(";")[1];
                        Emparejamiento.matchmake(player1, player2);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error en el formato de la entrada, debe ser [player1];[player2]");
                    }
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
                    System.out.println("Comando no reconocido");
                    break;
                }
        }
    }
}

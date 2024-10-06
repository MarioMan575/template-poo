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
        System.out.println("    + Create [player]");
        System.out.println("    + Remove [player]");
        System.out.println("    + Show");
        System.out.println("    + Rank ");
        System.out.println("    + Score [player];[score]");
        System.out.println("    + Show_matchmake");
        System.out.println("    + Clear_matchmake");
        System.out.println("    + Matchmake [player1];[player2]");
        System.out.println("    + Random matchmake");
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
                    try{
                        Emparejamiento emparejamiento = new Emparejamiento();
                        String nombres2 = teclado.next();
                        String nombre1 = nombres2.split(";")[0];
                        String nombre2 = nombres2.split(";")[1];
                        if (Jugador.estaAlta(nombre1) && Jugador.estaAlta(nombre2)){
                            Emparejamiento.matchmake(nombre1, nombre2);
                        }else{
                            System.out.println("No están dados de alta jugadores con esos nombres");
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Error en el formato de la entrada");
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

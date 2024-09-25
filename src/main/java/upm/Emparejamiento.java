package upm;

import java.util.ArrayList;
import java.util.List;

public class Emparejamiento {
    private static List<String[]> matchmake;
    public Emparejamiento(){
        Emparejamiento.matchmake = new ArrayList<>();
    }
    public static void matchmake(String player1, String player2){
        if (Jugador.estaAlta(player1) && Jugador.estaAlta(player2)){
            String[] match = {player1, player2};
            matchmake.add(match);
        }else{
            System.out.println("No están dados de alta jugadores con esos nombres");
        }
    }

    public static void showMatchmake(){
        for (int i = 0; i < matchmake.size(); i++) {
            System.out.println(matchmake.get(i)[0] + " vs " + matchmake.get(i)[1]);
        }
    }

    public static void clearMatchmake(){
        matchmake.clear();
    }

    public static void randomMatchmake(){
        List<Jugador> players = new ArrayList<>(Jugador.players);
        if (players.size() % 2 == 0) {
            java.util.Collections.shuffle(players);
            for (int i = 0; i < players.size(); i += 2) {
            String[] match = {players.get(i).getName(), players.get(i + 1).getName()};
            matchmake.add(match);
            }
        } else {
            System.out.println("No se puede emparejar, número de jugadores impar");
        }
    }
}


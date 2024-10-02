package upm;



import java.util.ArrayList;
import java.util.Comparator;

public class Jugador {

    private String name;
    private double score = 0.0;
    static ArrayList<Jugador> players = new ArrayList<>();

    public Jugador(String name, double score ){
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public static boolean estaAlta(String name){
        boolean encontrado = false;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equalsIgnoreCase(name)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void create(Jugador player){
        if (estaAlta(player.getName())) {
            System.out.println("No se puede dar de alta, ya existe un jugador con este nombre. ");
        }else{
            players.add(player);
            System.out.println("Jugador con nombre "+player.getName()+" dado de alta");
        }
    }

    public static boolean remove(String name){
        boolean bajado = false;
        if (estaAlta(name)) {
            for (int i = 0; i < players.size(); i++) {
                Jugador a = players.get(i);
                if (a.getName().equalsIgnoreCase(name)) {
                    players.remove(i);
                    bajado = true;
                }bajado = false;
            }
            System.out.println("Jugador dado de baja correctamente. ");
        }else{
            System.out.println("El jugador no está dado de alta. ");
            bajado = false;
        }
        return bajado;
    }

    public static void show(){
        for (int i = 0; i < players.size(); i++) {
            System.out.println(i+1+"."+players.get(i).getName());
        }
    }

    public static void score(double score, String player ){
        if (estaAlta(player)) {
            if (score>-999999.0) {
                for (int i = 0; i < players.size(); i++) {
                    Jugador a = players.get(i);
                    if (a.getName().equalsIgnoreCase(player)) {
                        a.setScore(score);
                        System.out.println("Puntuación actualizada correctamente. ");
                    }
                }
            }else{
                System.out.println("La puntuación no puede ser inferior a -999999.0");
            }
        }else{
            System.out.println("El jugador seleccionado no está dado de alta");
        }
    }

    public static void ranck(){
            players.sort(Comparator.comparingDouble(Jugador::getScore).reversed());
            for (int i = 0; i < players.size(); i++) {
                System.out.println(i+1+"."+players.get(i).getName()+" "+players.get(i).getScore());
            }
    }
}

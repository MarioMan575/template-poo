package upm;

import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private double puntuacion = 0.0;
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public Jugador(String nombre, double puntuacion ){
        this.nombre = nombre;
        puntuacion = 0.0;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean estaAlta(ArrayList<Jugador> jugadores, String nombre){
        boolean encontrado = false;
        for(Jugador jugador : jugadores){
            if (jugador.getNombre().equals(nombre)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void darAlta(Jugador jugador){
        if (estaAlta(jugadores, jugador.getNombre())) {
            System.out.println("No se puede dar de alta, ya eexiste un jugador con este nombre. ");
        }else{
            jugadores.add(jugador);
            System.out.println("Jugador con nombre "+jugador.getNombre()+" dado de alta");
        }
    }

    public void bajaJugador(Jugador jugador){
        if (estaAlta(jugadores, jugador.getNombre())) {
            jugadores.remove(jugador);
            System.out.println("Jugador dado de baja correctamente. ");
        }else{
            System.out.println("El jugador no está dado de alta. ");
        }
    }

    public void mostrarJugadores(ArrayList<Jugador> jugadores){
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(i+1+"."+jugadores.get(i).getNombre());
        }
    }
}

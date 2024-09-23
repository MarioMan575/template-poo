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

    public void darAlta(Jugador jugador){
        
    }

}

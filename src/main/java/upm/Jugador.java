package upm;

public class Jugador {

    private String nombre;
    private double puntuacion = 0.0;

    public Jugador(String nombre ){
        this.nombre = nombre;
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

}

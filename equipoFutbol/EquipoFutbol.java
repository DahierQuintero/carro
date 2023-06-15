package profundizacionJava.equipoFutbol;

import java.util.ArrayList;

public class EquipoFutbol {

    private String nombre;
    private String ciudad;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public EquipoFutbol () {
    }

    public EquipoFutbol (String nombre, String ciudad, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }

    public void agregarJugador (Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarInformacion () {
        System.out.println("\nInformacion del Equipo\n" +
                  "\nNombre: " + nombre
                + "\nCiudad: " + ciudad
                + "\nJugadores: \n");

        int c = 1;
        for (Jugador e: jugadores) {
            System.out.println(c + ":");
            e.dameDatos();
            c++;
            System.out.println();
        }
    }

    public String getNombre () {
        return nombre;
    }

    public String getCiudad () {
        return ciudad;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad (String ciudad) {
        this.ciudad = ciudad;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}

package profundizacionJava.equipoFutbol;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Jugador> jugadoresEquipo = new ArrayList<>(3);
        EquipoFutbol equipoFutbol1 = new EquipoFutbol("Real Madrid","Madrid",jugadoresEquipo);

        jugadoresEquipo.add(new Jugador("Firminho", 24,18));
        jugadoresEquipo.add(new Jugador("Virgil", 25,5));
        jugadoresEquipo.add(new Jugador("Lucho Diaz", 26,24));

        Jugador jugador1 = new Jugador("Alexander Arnold", 22,22);
        equipoFutbol1.agregarJugador(jugador1);

        equipoFutbol1.mostrarInformacion();
    }
}

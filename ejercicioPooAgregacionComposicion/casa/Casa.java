package profundizacionJava.ejercicioPooAgregacionComposicion.casa;

public class Casa {

    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;
    private final int CAPACIDAD_MAXIMA = 100;

    public Casa () {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        cantidadHabitaciones = 0;
    }

    public void agregarHabitacion (Habitacion habitacion) {
        if (cantidadHabitaciones < CAPACIDAD_MAXIMA) {
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        }
        else
            System.out.println("Ya no hay habitaciones disponibles");
    }

    public void destruirCasa () {
        habitaciones = null;
        cantidadHabitaciones = 0;
    }

    public void mostrarInformacionCasa () {
        System.out.println("Informacion de la casa:");
        System.out.println(cantidadHabitaciones != 0? "Cantidad de habitaciones: " + cantidadHabitaciones + "\n":
                "No hay habitaciones en la casa");
        for (int i = 0; i < cantidadHabitaciones; i++) {
            System.out.println("Habitacion: " + (i+1) +
                    "\nNumero de la habitacion: " + (habitaciones[i].getNumeroHabitacion()) +
                    "\nTamanio de la habitacion: " + (habitaciones[i].getTamanioHabitacion()) + "\n");
        }
    }
}

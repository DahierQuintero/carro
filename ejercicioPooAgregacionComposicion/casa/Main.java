package profundizacionJava.ejercicioPooAgregacionComposicion.casa;

public class Main {

    public static void main(String[] args) {

        Casa casa = new Casa();
        Habitacion habitacion1 = new Habitacion(1,5.8);
        Habitacion habitacion2 = new Habitacion(2,7.6);
        Habitacion habitacion3 = new Habitacion(3,9.4);

        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);
        casa.agregarHabitacion(habitacion3);

        casa.mostrarInformacionCasa();

        System.out.println("Destruimos la casa\n");
        casa.destruirCasa();

        casa.mostrarInformacionCasa();
    }
}

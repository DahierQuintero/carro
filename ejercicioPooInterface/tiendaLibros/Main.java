package profundizacionJava.ejercicioPooInterface.tiendaLibros;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("La magia de pensar en grande","David J Schwartz",120000);
        Libro libro2 = new Libro("Si lo crees, lo creas","Brian Tracy",80000);

        libro1.mostrarInformacion();
        System.out.println("Precio del primer libro: " + libro1.obtenerPrecio() + "\n");

        libro2.mostrarInformacion();
        System.out.println("Precio del segundo libro: " + libro2.obtenerPrecio() + "\n");
    }
}

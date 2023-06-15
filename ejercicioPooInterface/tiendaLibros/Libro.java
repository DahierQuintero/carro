package profundizacionJava.ejercicioPooInterface.tiendaLibros;

public class Libro implements Mostrable, Vendible{

    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Titulo: [" + titulo + "] - Autor: [" + autor + "] - Precio: [" + precio + "]");
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}

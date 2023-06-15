package profundizacionJava.equipoFutbol;

public class Jugador {

    private String nombre;
    private int edad;
    private int dorsal;

    public Jugador () {
    }

    public Jugador (String nombre, int edad, int dorsal) {
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
    }

    public void dameDatos () {
        System.out.println("Jugador: " + nombre + "\nEdad: "
                + edad + "\nDorsal: " + dorsal);
    }

    public String getNombre () {
        return nombre;
    }

    public int getEdad () {
        return edad;
    }

    public int getDorsal () {
        return dorsal;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}

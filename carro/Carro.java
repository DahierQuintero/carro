package profundizacionJava.carro;

public class Carro {

    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public Carro () {
    }

    public Carro (String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public void acelerar() {
        System.out.println("El carro " + marca + " está acelerando");
    }

    public void frenar () {
        System.out.println("El carro " + marca + " está frenando");
    }

    public void girar (String direccion) {
        if (direccion.equalsIgnoreCase("Derecha"))
            System.out.println("El carro está girando hacia la derecha");
        else if (direccion.equalsIgnoreCase("Izquierda"))
            System.out.println("El carro " + marca + " está girando hacia la izquierda");
    }

    public void mostrarInformacion () {
        System.out.println("\nInformacion del carro \nMarca: " + marca
        + "\nModelo: " + modelo
        + "\nAnio de fabricacion: " + anio
        + "\nColor: " + color
        +"\n-------------------------");
    }

    public String getMarca () {
        return marca;
    }

    public String getModelo () {
        return modelo;
    }

    public int getAnio () {
        return anio;
    }

    public String getColor () {
        return color;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public void setAnio (int anio) {
        this.anio = anio;
    }

    public void setColor (String color) {
        this.color = color;
    }
}

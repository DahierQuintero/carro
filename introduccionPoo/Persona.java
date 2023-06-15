package profundizacionJava.introduccionPoo;

public class Persona {

    private String nombre;
    private int edad;
    private int identificacion;

    public Persona(){
    }

    public Persona (String nombre, int edad, int identificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getEdad () {
        return edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getIdentificacion () {
        return identificacion;
    }

    public void mostrar () {
        System.out.println("Nombre: " + nombre + ". Edad: " + edad + ". Identificacion: " + identificacion);
    }

    public boolean esMayorDeEdad (int edad) {
        return edad >= 18;
    }

}

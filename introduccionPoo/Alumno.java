package profundizacionJava.introduccionPoo;

public class Alumno {

    private String nombre;
    private int edad;
    private int grado;

    public Alumno (){
        nombre = "XxxxxxxxX";
        edad = 16;
        grado = 11;
    }

    public Alumno (String nombre, int edad, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public String getNombre () {
        return nombre;
    }
    public int getEdad () {
        return edad;
    }
    public int getGrado () {
        return grado;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public void setGrado (int grado) {
        this.grado = grado;
    }
    public void mostrar () {
        System.out.println("Nombre: " + nombre + ". Edad: " + edad + ". Grado: " + grado);
    }
}

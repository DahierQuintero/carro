package profundizacionJava.introduccionPoo;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado () {
        nombre = "XxxxxxxxxX";
        edad = 30;
        salario = 1300000;
    }

    public Empleado (String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos () {
        return "El empleado se llama " + nombre + ". Tiene " + edad + " anios. " + "Y un salario de " + salario;
    }

    public String getNombre () {
        return nombre;
    }

    public int getEdad () {
        return edad;
    }

    public double getSalario () {
        return salario;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public void setSalario (double salario) {
        this.salario = salario;
    }
}

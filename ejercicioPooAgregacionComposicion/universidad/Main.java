package profundizacionJava.ejercicioPooAgregacionComposicion.universidad;

public class Main {

    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad XYZ");

        Estudiante estudiante1 = new Estudiante("Mariany Lopez",21,1);
        Estudiante estudiante2 = new Estudiante("Dahier Quintero",21,2);
        Estudiante estudiante3 = new Estudiante("Emily Quintero",15,3);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);

        System.out.println(universidad.getNombre() + "\n");

        Estudiante[] estudiantes = universidad.getEstudiantes();

        System.out.println("Estudiantes:");
        for (int i = 0; i < universidad.getCantidadEstudiantes(); i++) {
            System.out.println( (i+1) + ")\nNombre: " + estudiantes[i].getNombre()
            + "\nEdad: " + estudiantes[i].getEdad()
            + "\nNumero de estudiante: " + estudiantes[i].getNumeroEstudiante() + "\n");
        }
    }
}

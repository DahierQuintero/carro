package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.profesion;

public class Main {

    public static void main(String[] args) {

        Ingeniero ingeniero = new Ingeniero();
        System.out.println("Sueldo = " + ingeniero.calcularSueldo());

        Arquitecto arquitecto = new Arquitecto();
        System.out.println("Sueldo = " + arquitecto.calcularSueldo());

        Medico medico = new Medico();
        System.out.println("Sueldo = " + medico.calcularSueldo());

    }
}

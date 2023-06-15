package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.profesion;

public class Ingeniero extends Profeion {

    public Ingeniero() {
        bono = 5000000;
    }

    public Ingeniero(long sueldo, long bono) {
        super(sueldo, bono);
    }
}

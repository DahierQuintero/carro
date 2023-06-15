package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.profesion;

public class Arquitecto extends Profeion {

    public Arquitecto() {
        bono = 2000000;
    }

    public Arquitecto(long sueldo, long bono) {
        super(sueldo, bono);
    }
}

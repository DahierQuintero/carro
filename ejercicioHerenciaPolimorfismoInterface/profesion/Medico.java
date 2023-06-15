package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.profesion;

public class Medico extends Profeion {

    public Medico() {
        bono = 3000000;
    }

    public Medico(long sueldo, long bono) {
        super(sueldo, bono);
    }
}

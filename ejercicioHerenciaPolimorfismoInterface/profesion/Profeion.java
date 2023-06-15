package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.profesion;

public class Profeion {

    protected long sueldo;
    protected long bono;

    public Profeion () {
        sueldo = 2000000;
    }

    public Profeion (long sueldo, long bono) {
        this.sueldo = sueldo;
        this.bono = bono;
    }

    public long getBono() {
        return bono;
    }

    public void setBono(long bono) {
        this.bono = bono;
    }

    public long calcularSueldo () {
        return sueldo + bono;
    }
}

package profundizacionJava.introduccionPoo;

public class Contador {

    private int cont;

    public Contador () {
    }

    public Contador (int cont) {
        if (cont > 0)
            this.cont = cont;
        else
            this.cont = 0;
    }

    public Contador (final Contador contador) {
        cont = contador.cont;
    }

    public void incrementar () {
        cont++;
    }

    public void decrementar () {
        if (cont > 0)
            cont--;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont > 0)
            this.cont = cont;
        else
            this.cont = 0;
    }
}

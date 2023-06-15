package profundizacionJava.carroComposicion;

public class Llanta {

    private String tipoRin;
    private String marca;

    public Llanta (String tipoRin, String marca) {
        this.tipoRin = tipoRin;
        this.marca = marca;
    }

    public String getTipoRin() {
        return tipoRin;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "\nLlanta\n" +
                "tipoRin: " + tipoRin +
                "\nmarca: " + marca + "\n";
    }
}

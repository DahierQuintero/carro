package profundizacionJava.carroComposicion;

public class Motor {

    private String marca;
    private String nombreValvula;

    public Motor (String marca, String nombreValvula) {
        this.marca = marca;
        this.nombreValvula = nombreValvula;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombreValvula() {
        return nombreValvula;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private void setNombreValvula(String nombreValvula) {
        this.nombreValvula = nombreValvula;
    }
}

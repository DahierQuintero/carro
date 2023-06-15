package profundizacionJava.ejercicioPooInterface.reproductorMusica;

public class OttoMusic implements ReproductorMusica {

    private String nombreReproductor;

    public OttoMusic () {
        nombreReproductor = "Otto Music";
    }

    public String getNombreReproductor() {
        return nombreReproductor;
    }

    @Override
    public void reproducirMusica() {
        System.out.println("La musica esta en reproducion");
    }

    @Override
    public void pausarMusica() {
        System.out.println("La musica esta en pausa");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("La reproduccion se detuvo");
    }
}

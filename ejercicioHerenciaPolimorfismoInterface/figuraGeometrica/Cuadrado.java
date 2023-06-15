package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.figuraGeometrica;

public class Cuadrado implements FiguraGeometrica, Poligono {

    private int alto;
    private int ancho;

    public Cuadrado(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public int calcularArea() {
        return alto * ancho;
    }

    @Override
    public int calcularPerimetro() {
        return (alto + ancho) * 2;
    }

    @Override
    public int calcularNumeroLados() {
        return 4;
    }
}

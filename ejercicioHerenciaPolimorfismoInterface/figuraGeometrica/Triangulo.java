package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.figuraGeometrica;

public class Triangulo implements FiguraGeometrica, Poligono{

    private int alto;
    private int base;

    public Triangulo(int alto, int base) {
        this.alto = alto;
        this.base = base;
    }

    @Override
    public int calcularArea() {
        return (base * alto)/2;
    }

    @Override
    public int calcularPerimetro() {
        return 0;
    }

    @Override
    public int calcularNumeroLados() {
        return 3;
    }
}

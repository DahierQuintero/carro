package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.figuraGeometrica;

public class Circulo implements FiguraGeometrica{

    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public int calcularArea() {
        return (int) (Math.PI * radio) * 2;
    }

    @Override
    public int calcularPerimetro() {
        return (int) (Math.PI * 2) * radio;
    }
}

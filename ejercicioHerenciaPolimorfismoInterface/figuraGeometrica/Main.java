package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.figuraGeometrica;

public class Main {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(10,10);
        Triangulo triangulo = new Triangulo(10,3);
        Circulo circulo = new Circulo(5);

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println("Lados del cuadrado: " + cuadrado.calcularNumeroLados() + "\n");

        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + triangulo.calcularPerimetro());
        System.out.println("Lados del triangulo: " + triangulo.calcularNumeroLados() + "\n");

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + triangulo.calcularPerimetro());
    }
}

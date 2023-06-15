package profundizacionJava.carro;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("BMW","X6",2023,"Negro");
        Carro carro2 = new Carro("Toyota","Supra MK3",2002,"Naranjado");
        Carro carro3 = new Carro("Nissan","Skyline GTR",2002,"Azul");

        carro1.acelerar();
        carro1.frenar();
        carro1.girar("derecha");
        carro1.mostrarInformacion();

        carro2.acelerar();
        carro2.frenar();
        carro2.girar("izquierda");
        carro2.mostrarInformacion();

        carro3.acelerar();
        carro3.frenar();
        carro3.girar("DERECHA");
        carro3.mostrarInformacion();

    }
}

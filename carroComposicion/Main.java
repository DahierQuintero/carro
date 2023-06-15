package profundizacionJava.carroComposicion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Motor motor1 = new Motor("BMW","Monometalica");

        Carro carro1 = new Carro(motor1);

        Llanta llantaDI = new Llanta("Aluminio","BBS");
        Llanta llantaDD = new Llanta("Aluminio","BBS");
        Llanta llantaTI = new Llanta("Aleacion","BBS");
        Llanta llantaTD = new Llanta("Aleacion","BBS");

        carro1.agregarLlanta(llantaDI);
        carro1.agregarLlanta(llantaDD);
        carro1.agregarLlanta(llantaTI);
        carro1.agregarLlanta(llantaTD);
        carro1.agregarLlanta(llantaTD);

        System.out.println(Arrays.toString(carro1.getLlanta()));
        System.out.println(carro1.getMotor().getMarca());
    }
}

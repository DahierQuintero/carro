package profundizacionJava.carroComposicion;

public class Carro {

    private Motor motor;
    private Llanta[] llantas;
    private int numeroLlanta = 0;

    public Carro(Motor motor) {
        this.motor = motor;
        this.llantas = new Llanta[4];
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta[] getLlanta() {
        return llantas;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llantas = llanta;
    }

    public void agregarLlanta (Llanta llanta) {

        if (numeroLlanta < 4) {
            this.llantas[numeroLlanta] = llanta;
            numeroLlanta++;
        }
        else
            System.out.println("La cantidad de llantas es mayor a 4");
    }
}

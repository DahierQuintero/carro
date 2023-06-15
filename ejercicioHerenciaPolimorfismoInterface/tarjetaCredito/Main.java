package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.tarjetaCredito;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Clasica clasica = new Clasica("American Express",5000000,"123456789",2501, LocalDate.of(2023,9,1));
        Dorada dorada = new Dorada("Master Card",8000000,"123456789",250, LocalDate.of(2023,8,1));
        Platinum platinum = new Platinum("Visa",12000000,"123456789",501, LocalDate.of(2023,7,16));
        Black black = new Black("American Express",15000000,"123456789",251, LocalDate.of(2023,6,11));

        clasica.imprimir();
        System.out.println();
        dorada.imprimir();
        System.out.println();
        platinum.imprimir();
        System.out.println();
        black.imprimir();
    }
}

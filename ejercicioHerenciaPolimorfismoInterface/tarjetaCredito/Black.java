package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.tarjetaCredito;

import java.time.LocalDate;

public class Black extends TarjetaCredito {

    public Black(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}

package profundizacionJava.ejercicioHerenciaPolimorfismoInterface.tarjetaCredito;

import java.time.LocalDate;

public class TarjetaCredito {

    protected String emisor;
    protected long cupo;
    protected String numeroTarjeta;
    protected int cvv;
    protected LocalDate fechaVencimiento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void imprimir () {
        System.out.println("Emisor: " + emisor
                        + "\nCupo: " + cupo
                        + "\nNumero de Tarjeta: " + numeroTarjeta
                        + "\nCvv: " + cvv
                        + "\nFecha de Vencimiento: " + fechaVencimiento);
    }
}

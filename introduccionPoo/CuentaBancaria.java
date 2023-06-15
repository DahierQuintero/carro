package profundizacionJava.introduccionPoo;

public class CuentaBancaria extends Cuenta{

    private long numeroDeCuenta;

    public CuentaBancaria () {
        this.setTitular("-------------");
        this.setCantidad(3000000);
    }
    public CuentaBancaria (String nombreDelTitular, double saldoDeCuenta) {
        this.setTitular(nombreDelTitular);
        this.setCantidad(saldoDeCuenta);
    }

    public long getNumeroDeCuenta () {
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta (long numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public String getDatosCuenta () {
        return "Titular: " + this.getTitular() + ". Cuenta: " + this.getCantidad() + ". Numero de Cuenta: "
                + numeroDeCuenta;
    }
}

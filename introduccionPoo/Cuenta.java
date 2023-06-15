package profundizacionJava.introduccionPoo;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta (){
    }

    public Cuenta (String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void mostrar () {
        System.out.println("Titular: " + titular + ". cuenta: " + cantidad);
    }
    public void ingresar (double saldoIngresado) {
        cantidad += saldoIngresado;
    }
    public void retirar (double saldoRetirar) {
        if (saldoRetirar <= cantidad)
            cantidad -= saldoRetirar;
        else
            System.out.println("fondos insuficientes");
    }
    public String getTitular () {
        return titular;
    }
    public double getCantidad () {
        return cantidad;
    }
    public void setTitular (String titular) {
        this.titular = titular;
    }
    public void setCantidad (double cantidad) {
        this.cantidad = cantidad;
    }
}

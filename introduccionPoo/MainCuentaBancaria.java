package profundizacionJava.introduccionPoo;

public class MainCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Dahier",8000000);
        System.out.println(cuenta1.getDatosCuenta());
    }
}

package profundizacionJava.introduccionPoo;

import java.util.ArrayList;

public class MainEmpleado {

    public static void main(String[] args) {

        /*Empleado[] listaEmpleados = new Empleado[3];

        listaEmpleados[0] = new Empleado();
        listaEmpleados[1] = new Empleado("Dahier Quintero", 21,8000000);
        listaEmpleados[2] = new Empleado();*/

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.size();

        listaEmpleados.add(new Empleado());
        listaEmpleados.add(new Empleado("Mariany Lopez",21,8000000));
        listaEmpleados.add(new Empleado("Dahier Quintero", 21, 8000000));
        listaEmpleados.add(new Empleado());

        System.out.println(listaEmpleados.size());

        for (Empleado e: listaEmpleados)
            System.out.println(e.dameDatos());

    }
}

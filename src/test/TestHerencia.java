package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        //Aunque no se define nada en la clase EMPLEADO podemos acceder a los metodos de PERSONA por extender
        System.out.println("empleado1 = " + empleado1);

        System.out.println("\n");

        Cliente cliente1 = new Cliente(new Date(),true, "samu", 'F', 27, "Pachuca");
        System.out.println("cliente = " + cliente1);
        Cliente cliente2 = new Cliente(new Date(), false, "Hakku", 'M', 32, "Sinaloa");
        System.out.println("cliente = " + cliente2);
    }
}

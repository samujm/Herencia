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
        
        var fecha = new Date();//Se crea el objeto fecha por separado para no tener problema al ejecutar paso a paso

        Cliente cliente1 = new Cliente(fecha, true, "samu", 'F', 27, "Pachuca"); //se pasa la variable
        System.out.println("cliente = " + cliente1);
        Cliente cliente2 = new Cliente(fecha, false, "Hakku", 'M', 32, "Sinaloa");
        System.out.println("cliente = " + cliente2);
    }
}


package test;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        //Aunque no se define nada en la clase EMPLEADO podemos acceder a los metodos de PERSONA por extender
        System.out.println("empleado1 = " + empleado1);
    }
}

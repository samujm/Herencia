package domain;

public class Empleado extends Persona {
    //En java solo existe herencia simple
    //Aunque no se define nada en la clase EMPLEADO podemos acceder a los metodos de PERSONA por extender
    //LOS CONSTRUCTORES NO SE HEREDAN pero se acceden a traves de la palabra SUPER

    //Si esta clase de empleados va a tener subclase para definir los atributos como protected o private por si va a tener clases hijas
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) { //Constructor con dos atributos
        super(nombre); //Manda llamar el constructor de la clase padre
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    //EL METODO SET DE EMPLEADO NO SE UTILIZA POR QUE EL CONSTRUCTOR SE ENCARGA DE ASIGNAR EL VALOR AL ATRIBUTO DE IDEMPLEADO
//    public void setIdEmpleado(int idEmpleado){
//        this.idEmpleado = idEmpleado;
//    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    //StringBuilder es una clase donde si podemos modificar internamente los valores
    //con append va concatenando de manera distinta
    //esto se hizo con el IDE
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado); //Agregar el this
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}

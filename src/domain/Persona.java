package domain;

public class Persona {

    protected String nombre; //Todo lo privado no se hereda a las clases hijas, pero protected si
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void getDireccion(String direccion) {
        this.direccion = direccion;
    }

//    @Override
//    public String toString(){
//        return "Persona: [ nombre: " + nombre +
//                ", genero: " + genero +
//                ", edad: " + edad + 
//                ", direccion: " + direccion +
//                " ]";
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());//Hace una llamada a su padre que es object a su metodo toString
        sb.append('}');
        return sb.toString();
    }

}

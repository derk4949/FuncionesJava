package persona;

public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "nombre: "+ this.nombre + ", Apellido: " + this.apellido + "dir. Mem. " + super.toString();
    }
}



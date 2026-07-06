public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        Persona objeto1 = new Persona();  //  sucede que estoy mandando a llamar el constructor de una clase
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();
        // Segundo objeto
        System.out.println();
        Persona objeto2 = new Persona();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gomez";
        objeto2.mostrarPersona();
        System.out.println();

        Persona flores = new Persona();
        flores.nombre = "Christian Arnold";
        flores.apellido = "Flores Alarcon";
        flores.mostrarPersona();
    }

}
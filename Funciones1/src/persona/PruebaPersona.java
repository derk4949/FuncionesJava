package persona;

public class PruebaPersona{
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        Persona objeto1 = new Persona("Layla","Acosta");  //  sucede que estoy mandando a llamar el constructor de una clase
        System.out.println(objeto1); // AUTOMATICAMENTE SE LLAMA A toString

    }

}
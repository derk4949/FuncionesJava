package io.github.derk4949.javabeans;

import java.io.Serializable;


//javabeans ES SOLO UN ESTANDAR PARA QUE SE PUEDAN CREAR OBJETOS SIN NECESIDAD DE PROPORCIONAR MAS INFORMACION PARA QUE SE PUEDA MODIFICAR
//LA INFORMACION DE LOS ATRIBUTOS Y TAMBIEN SE PUEDAN LEER  Y TAMBIEN TIENE LA INTERFACE  DE SERIALIZABLE
public class JavaBeans {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona = " + persona);
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("nombre: "+persona.getApellido());

    }
}


class Persona implements Serializable {
    private String nombre;
    private String apellido;


    public Persona(){
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
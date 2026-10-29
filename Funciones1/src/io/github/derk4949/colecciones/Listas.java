package io.github.derk4949.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("lunes");
        miLista.add("martes");
        miLista.add("miercoles");
        miLista.add("jueves");
        miLista.add("viernes");
        miLista.add("sabado");
        miLista.add("domingo");

//        miLista.add("domingo");    //permite elementos duplicados

        for (Object elemento: miLista){  //en vez de String se usa Object en caso no se especifique que tipo de dato se guarda en array
            System.out.println("dias de la semana: " +elemento);
        }


//         FUNCIONES LAMBDA  ( FUNCION ANONIMA DE UN CODIGO MUY COMPACTO
//         TAMBIEN SE LE CONOCE COMO PROGRAMACION FUNCIONAL EN JAVA

        miLista.forEach(elemento -> {   // flecha decimos que comenzamos el cuerpo de la funcion lambda
            System.out.println("Elementos: " + elemento);
        });
// puede tener varias lineas de codigo pero se recomienda que sea compacto
// el objetivo DE LA PROGRAMACION FUNCIONAL Y LAS EXPRESIONES LAMBDA ES QUE SE PUEDA SIMPLIFICAR CODIGO Y MAS LEGIBLE
// DESVENTAJA QUE SE OCULTA MUCHO EL DETALLE DEL CODIGO



//        METODO DE REFERENCIA :::::
        miLista.forEach(System.out::println);
//        mucha mas compacta

        List<String> nombres = Arrays.asList("Pedro","Ivonne","Nohemi");
        System.out.println("\n Lista de nombres: ");
        nombres.forEach(System.out::println);

    }

}

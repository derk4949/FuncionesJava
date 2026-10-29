package io.github.derk4949.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "Diego");
        persona.put("apellido", "flores");
        persona.put("edad", "31");
//        persona.put("edad", "31");   // como se puede ver no puede haber duplicado

        System.out.println("Valores de mapa");
        persona.entrySet().forEach(System.out::println);  // como se puede ver entySet no respeto el orden de inserccion
        persona.put("edad", "35"); //modificar el valor de llave existente
        persona.remove("apellido");

        System.out.println("\nnuevos valores de mapa:");
        persona.entrySet().forEach(System.out::println);

        //ITERAR SOBRE LOS ELEMENTOS DEL MAPA POR SEPARADO
        System.out.println("\nIterando los elementos (llave,valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", Valor: "+ valor);
        });

//        forma de una sola linea NO LLEVA {}
        persona.forEach((llave, valor) -> System.out.println("Llave: " + llave + ", Valor: "+ valor));

    }

}

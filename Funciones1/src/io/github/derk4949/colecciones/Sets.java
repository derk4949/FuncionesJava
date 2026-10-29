package io.github.derk4949.colecciones;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main() {
        Set<String> conjunto = new TreeSet<>();

        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");
        conjunto.add("Arnold");

        System.out.println("Elemenos del set");
        conjunto.forEach(System.out::println);

        //remover elemento
        conjunto.remove("Karla");
        System.out.println("\nElemenos del set");
        conjunto.forEach(System.out::println);

    }
}
//SET no permite tener elementos duplicados
// se mantiene un orden de inseccion    algunos set si permiten
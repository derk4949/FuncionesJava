package io.github.derk4949.temasavanzados;

public class ForEachPrueba {
    public static void main(String[] args){
        int edades[] = {5, 10, 30, 45};

        for (int edad : edades){
            System.out.println(edad);
        }
        // desventaja de usar este for esto es que ya no se tiene acceso al indice
    }
}

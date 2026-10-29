package io.github.derk4949.temasavanzados;

public class ArgumentosVariables {
    public static void main(String[] args) {
//        imprimirNumeros(1,2,3,4,5);
        variosParametros("Karla",10,20,30);    //argumentos que no son variables tienen que ir antes de los variables
    }



    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombres: "+ nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}

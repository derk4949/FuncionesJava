package io.github.derk4949.excepciones;


//EXISTEN 2 TIPOS DE ERRORES
// EN TIEMPO DE COMPILACION
// Y ERRORES DE EXCEPCIONES EN TIEMPO DE EJECUCION
public class Excepciones {
    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 0;

        try {
            int resultado = valor1 / valor2;
            System.out.println("resultado = " +resultado);

        }catch (Exception e){
            System.out.println("ja  division by zero\n" + e);
        }
    }

}

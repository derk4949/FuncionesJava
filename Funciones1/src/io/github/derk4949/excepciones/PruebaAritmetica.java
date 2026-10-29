package io.github.derk4949.excepciones;

public class PruebaAritmetica {
    static void main(String[] args) {

        try {
            int resultado = Aritmetica.division(10,2);
            System.out.println("resultado = "+ resultado);
        }catch (Exception e){ // solo se ejecuta si encuentra una excepcion
            System.out.println("ocurrio un error "+ e);
        }

        finally { // esto se va ejecutar siempre independiente que se lance una excepcion o no
            System.out.println("se reviso la division entre 0");
        }
    }
}

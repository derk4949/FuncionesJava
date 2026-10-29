package io.github.derk4949.excepciones;


// en caso que se ejecute el programa en cambio excepcion es en tiendo de compilacion se
// Y se usaria  thows Excepcion en la firma de metodo

public class Aritmetica {
    public static int division(int numerador, int denominador){

        if (denominador == 0)
            throw new RuntimeException("division entre cero");
        return numerador/ denominador;

    }
}
// si se usa Excepcion noma  se va tener que obligar a poner un try catch
// en cambio RuntimeExcepcion es excepcion en tiempo de ejecucion lo cual no estamos obligados a poner el bloque try catch

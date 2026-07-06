public class Aritmetica1sinconstructor {
    int operando1;
    int operando2;

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    void multiplicar(){
        var resultado = operando1 * operando2;
        System.out.println("Resultado de la multiplicacion es "+resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmetica.Aritmetica ***");
        var aritmetica1 = new Aritmetica1sinconstructor();
        aritmetica1.operando1 = 5;
        aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.restar();
        aritmetica1.multiplicar();
        // Creamos un segundo objeto
        var aritmetica2 = new Aritmetica1sinconstructor();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        System.out.println();
        aritmetica2.sumar();
        aritmetica2.restar();
        aritmetica2.operando1 = 10;
        aritmetica2.operando2 = 15;
        System.out.println();
        aritmetica2.sumar();
        aritmetica2.restar();
        aritmetica2.multiplicar();
    }
}

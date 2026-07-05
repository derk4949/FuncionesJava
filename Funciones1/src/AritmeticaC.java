public class AritmeticaC {
    int operando1;
    int operando2;

    //CONSTRUCTOR VACIO
    public AritmeticaC(){

    }
    //
    public AritmeticaC(int op1, int op2){
        System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
    }

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        AritmeticaC aritmetica1 = new AritmeticaC(5,7);
//        aritmetica1.operando1 = 5;
//        aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.restar();

        //CONNSTRUCTOR VACIO
        AritmeticaC aritmetica2 = new AritmeticaC();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 8;
        aritmetica2.sumar();

    }
}

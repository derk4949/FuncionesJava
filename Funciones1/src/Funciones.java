public class Funciones {


    //PÚBLIC SE USA PARA LLAMAR A OTROS ARCHIVOS EN ESTE CASO POR ESO NO LO PONEMOS
    //AQUI LO que haydentro de () se llama parametro
    static void saludar(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {

        //AQUI LO que haydentro de () se llama argumento
        saludar("Hola desde Java");
        saludar("Adios");
    }
}

package io.github.derk4949.interfaces;

// EL OBJETIVO DE USAR INTERFACES ES PARA ESTANDARIZAR EL COMPORTAMIENTO DE NUESTRO CODIGO

public interface Traductor {
    // public y abstract
    void traducir();

    //metodos com implementacion por defaut
    default void iniciarTraductor(){
        System.out.println("iniciar traductor...");

    }
}

class Ingles implements Traductor{
    @Override                   // estamos agregando la iplementacion traducir
    public void traducir() {
        System.out.println("traduzco a ingles");
    }
}
class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("traduzco a frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en frances");
    }
}
class PruebaTraductor{
    public static void main(String[] args){
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();

        Traductor frances = new Frances();
        frances.traducir();
        frances.iniciarTraductor();

    }
}
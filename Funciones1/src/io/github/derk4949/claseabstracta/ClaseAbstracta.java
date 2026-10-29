package io.github.derk4949.claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {

//        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();  // error no se puede instanciar

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();

        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();


    }
}

abstract class FiguraGeometrica{
    public abstract void dibujar();
}


class Rectangulo extends FiguraGeometrica{     // no se puede instanciar
    @Override
    public void dibujar(){
        System.out.println("se dibuja un rectangulo");
    }
}


class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("se dibuja un circulo");
    }
}
package io.github.derk4949.sistemaventas;

public class Orden {
    private static int contadorOrden = 1;
    private int idOrden;

    private String productos;
    private double precioTotal;

    public Orden(String productos, double precioTotal){
        this.productos = productos;
        this.precioTotal = precioTotal;

        this.idOrden = ++Orden.contadorOrden;
    }
}


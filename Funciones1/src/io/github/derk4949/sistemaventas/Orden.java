package io.github.derk4949.sistemaventas;

public class Orden {
    private static int contadorOrden = 0;
    private int idOrden;

    private Producto productos;
    private double precioTotal;

    public Orden(Producto productos, double precioTotal){
        this.productos = productos;
        this.precioTotal = precioTotal;

        this.idOrden = ++Orden.contadorOrden;
    }
}


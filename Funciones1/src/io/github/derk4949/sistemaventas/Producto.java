package io.github.derk4949.sistemaventas;

public class Producto {
    private static int contadorProducto = 0;

    private int idProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){

        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProducto;
    }

}

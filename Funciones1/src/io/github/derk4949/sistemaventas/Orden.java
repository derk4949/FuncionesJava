package io.github.derk4949.sistemaventas;

import java.util.Arrays;

public class Orden {
    private static int contadorOrdenes = 0;
    private int idOrden;

    private Producto[] productos;
    private int contadorProductos;

    private double precioTotal;
    private static final int MAX_PRODUCTOS = 10;


    public Orden(){
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
        this.precioTotal = precioTotal;

        this.idOrden = ++Orden.contadorOrdenes;
    }

    public void agregarProductos(Producto producto){
        if (contadorProductos == MAX_PRODUCTOS){
            System.out.println("no hay espacio suficiente en esta orden N."+ Orden.contadorOrdenes + "porfavor crear otra orden");
        } else{
            this.productos[this.contadorProductos] = producto;
            contadorProductos++;
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();  // total = total + producto.getPrecio()
        }
        return total;
    }

//    public void mostrarOrden(){
//        System.out.println("id orden; "+ this.idOrden);
//        double totalOrden = this.calcularTotal();
//        System.out.println("\t total de la orden; $"+ totalOrden);
//        System.out.println("\t Productos de la orden: ");
//        for (int i = 0; i < this.contadorProductos; i++ ){
//            System.out.println("\t\t"+ this.productos[i]);
//        }
//    }

    @Override
    public String toString() {
        String resultado = "id orden; "+ this.idOrden + "\n";
        double totalOrden = this.calcularTotal();
        resultado += "\t total de la orden; $"+ totalOrden + "\n";
        resultado += "\t Productos de la orden: " + "\n";
        for (int i = 0; i < this.contadorProductos; i++ ){
            resultado+= "\t\t" + this.productos[i] + "\n";
        }
        return resultado;
    }
}


package io.github.derk4949.sistemaventas;

public class Main {
    public static void main(String[] args){

        Producto producto1 = new Producto("blusa", 30.00);

        Producto producto2 = new Producto("zapatillas", 50.00);

        Producto producto3 = new Producto("Pantalon", 60.00);

        Producto producto4 = new Producto("camisa", 40.00);

        Orden orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        orden1.mostrarOrden();

        orden1.agregarProductos(producto3);
        orden1.agregarProductos(producto4);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProductos(new Producto("Playera", 15.00));
        orden2.mostrarOrden();
    }
}

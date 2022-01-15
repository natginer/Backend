package mesas;

public class Main {
    public static void main(String[] args) {
        Carrito carrito= new Carrito();
        Producto p1= new Producto("Gaseosa",110);
        Producto p2= new Producto("Gaseosa2",180);
        carrito.avanzar();
        carrito.agregar(p1);
        carrito.avanzar();
        carrito.agregar(p1);
        carrito.mostrarProductos();
    }
}

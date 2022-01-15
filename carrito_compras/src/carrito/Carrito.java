package mesas;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private Estado estado;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Carrito() {
        productos= new ArrayList<>();
        estado=new Vacio(this);
    }
    public void agregar(Producto p){
        getEstado().agregar(p);
    }
    public void cancelar(){
        getEstado().cancelar();
    }
    public void volver(){
        getEstado().volver();
    }
    public void avanzar(){
        getEstado().avanzar();
    }

    public void mostrarProductos(){
        for (Producto p:productos) {
            System.out.println(p.getDescripcion()+": "+p.getPrecio());
        }
    }
}

package mesas;

public class Vacio implements Estado{
    private Carrito c;

    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }

    public Vacio(Carrito c) {
        this.c = c;
        c.getProductos().clear();
    }

    @Override
    public void agregar(Producto p) {

    }

    @Override
    public void cancelar() {

    }

    @Override
    public void volver() {

    }

    @Override
    public void avanzar() {
        c.setEstado(new Cargando(c));
    }
}

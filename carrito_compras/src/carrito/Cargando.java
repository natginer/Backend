package mesas;

public class Cargando implements Estado{
    private Carrito c;

    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregar(Producto p) {
        c.getProductos().add(p);
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volver() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void avanzar() {
        c.setEstado(new Pagando(c));
    }
}

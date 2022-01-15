package mesas;

public class Pagando implements Estado{
    private Carrito c;

    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }

    public Pagando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregar(Producto p) {

    }

    @Override
    public void cancelar() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volver() {
        c.setEstado(new Cargando(c));
    }

    @Override
    public void avanzar() {
        c.setEstado(new Cerrado(c));
    }
}

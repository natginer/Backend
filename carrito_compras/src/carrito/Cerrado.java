package mesas;

public class Cerrado implements Estado{
    private Carrito c;

    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }

    public Cerrado(Carrito c) {
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
        c.setEstado(new Pagando(c));
    }

    @Override
    public void avanzar() {
        c.setEstado(new Vacio(c));
    }
}

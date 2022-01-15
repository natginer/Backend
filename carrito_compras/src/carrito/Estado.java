package mesas;

public interface Estado {
    void agregar(Producto p);
    void cancelar();
    void volver();
    void avanzar();
}

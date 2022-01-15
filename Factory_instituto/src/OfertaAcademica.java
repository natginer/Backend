public abstract class OfertaAcademica {
    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString(){
        return "Nombre: "+nombre+" - Precio: "+calcularPrecio();
    }
}

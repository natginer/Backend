package examen;

public class ServicioSimple extends Servicio{
    private double precio;

    @Override
    public double calcularPrecio() {
        if(this.nombre.equalsIgnoreCase("Colocacion")){
            return this.precio * 1.10;
        }
        return this.precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

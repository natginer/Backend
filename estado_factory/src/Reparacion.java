public class Reparacion {
    private String articulo;
    private double presupuestado;
    private String direccion;
    private ReparacionState estado;
    public void incrementarPresupuestoEn(double valor){
        presupuestado+=valor;
    }
    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPresupuestado() {
        return presupuestado;
    }

    public void setPresupuestado(double presupuestado) {
        this.presupuestado = presupuestado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ReparacionState getEstado() {
        return estado;
    }

    public void setEstado(ReparacionState estado) {
        this.estado = estado;
    }

    public Reparacion(String articulo) {
        this.articulo = articulo;
        estado=FactoryReparacionState.getInstance().obtenerReparacionState("EnPresupuesto",this);
    }

    public void cambiarDireccion(String dir) {
        estado.cambiarDireccion(dir);
    }


    public void sumaRepuestos(double valor) {
        estado.sumaRepuestos(valor);
    }


    public void valorPresupuesto(double valor) {
        estado.valorPresupuesto(valor);
    }


    public void siguientePaso() {
        estado.siguientePaso();
    }
    public void mostrarInfo(){
        System.out.println("Articulo: "+this.getArticulo());
        System.out.println("Presupuesto: "+this.getPresupuestado());
        System.out.println("Dirección: "+this.getDireccion());
        System.out.println("----------------------");
    }
}

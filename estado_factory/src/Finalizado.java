public class Finalizado implements ReparacionState{
    private Reparacion r;

    public Finalizado(Reparacion r) {
        this.r = r;
        System.out.println("Finalizado");
    }

    @Override
    public void cambiarDireccion(String dir) {
        System.out.println("No disponible");
    }

    @Override
    public void sumaRepuestos(double valor) {
        System.out.println("No disponible");
    }

    @Override
    public void valorPresupuesto(double valor) {
        System.out.println("No disponible");
    }

    @Override
    public void siguientePaso() {
        System.out.println("No disponible");
    }
}

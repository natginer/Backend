public class ParaEnvio implements ReparacionState{
    private Reparacion r;

    public ParaEnvio(Reparacion r) {
        this.r = r;
        System.out.println("Para envío");
    }

    @Override
    public void cambiarDireccion(String dir) {
        r.setDireccion(dir);
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
        r.setEstado(FactoryReparacionState.getInstance().obtenerReparacionState("Finalizado",r));
    }
}

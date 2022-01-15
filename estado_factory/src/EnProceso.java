public class EnProceso implements ReparacionState{
    private Reparacion r;

    public EnProceso(Reparacion r) {
        this.r = r;
        System.out.println("En proceso de reparación");
    }

    @Override
    public void cambiarDireccion(String dir) {
        System.out.println("No disponible");
    }

    @Override
    public void sumaRepuestos(double valor) {
        r.setPresupuestado(r.getPresupuestado()+valor);
    }

    @Override
    public void valorPresupuesto(double valor) {
        System.out.println("No disponible");
    }

    @Override
    public void siguientePaso() {
        r.setEstado(FactoryReparacionState.getInstance().obtenerReparacionState("ParaEnvio",r));
    }
}

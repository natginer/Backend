public class EnPresupuesto implements ReparacionState{
    private Reparacion r;

    public EnPresupuesto(Reparacion r) {
        this.r = r;
        System.out.println("En Presupuesto");
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
        r.setPresupuestado(valor);
    }

    @Override
    public void siguientePaso() {
        r.setEstado(FactoryReparacionState.getInstance().obtenerReparacionState("EnProceso",r));
    }
}

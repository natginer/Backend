public class FactoryReparacionState {
    private static FactoryReparacionState instancia;

    private FactoryReparacionState(){

    }

    public static FactoryReparacionState getInstance(){
        if (instancia==null)
            instancia = new FactoryReparacionState();
        return instancia;
    }

    public ReparacionState obtenerReparacionState(String tipo, Reparacion r)
    {
        switch (tipo)
        {
            case "EnPresupuesto":
                return new EnPresupuesto(r);
            case "EnProceso":
                return new EnProceso(r);
            case "ParaEnvio":
                return new ParaEnvio(r);
            case "Finalizado":
                return new Finalizado(r);
            default:
                System.out.println("No encontramos este objeto para construir");
                return null;
        }
    }
}

public class ServicioTecnico {
    public static void main(String[] args) {
        Reparacion rep1= new Reparacion("Batidora");
        rep1.valorPresupuesto(1000);
        rep1.mostrarInfo();
        rep1.siguientePaso();
        rep1.sumaRepuestos(150);
        rep1.mostrarInfo();
        rep1.siguientePaso();
        rep1.cambiarDireccion("Av. Libertador 1500");
        rep1.mostrarInfo();
        rep1.siguientePaso();

    }
}

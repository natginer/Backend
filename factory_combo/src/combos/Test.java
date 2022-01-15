package examen;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Electro");

        Servicio ventaAire = ServicioFactory.getInstance().crearServicio("Simple");
        ventaAire.setNombre("Venta de aire acondicionado");
        ventaAire.setDescripcion("Venta");
        ((ServicioSimple)ventaAire).setPrecio(65000);

        Servicio colocacionAire = ServicioFactory.getInstance().crearServicio("Simple");
        colocacionAire.setNombre("Colocacion");
        colocacionAire.setDescripcion("Venta");
        ((ServicioSimple)colocacionAire).setPrecio(10000);

        Servicio combo = ServicioFactory.getInstance().crearServicio("Combo");
        combo.setNombre("Combo A");
        combo.setDescripcion("Combo venta/colocacion");
        ((Combo)combo).setDescuento(10);
        ((Combo)combo).addServicio(ventaAire);
        ((Combo)combo).addServicio(colocacionAire);

        empresa.addServicio(ventaAire);
        empresa.addServicio(colocacionAire);
        empresa.addServicio(combo);

        empresa.generarInforme();


    }
}
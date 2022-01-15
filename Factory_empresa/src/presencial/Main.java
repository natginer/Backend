package presencial;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Mascotas");
        // empleado 3 nuevo
        EmpleadoContratado emp3=(EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp3.setNombre("Pablo");
        emp3.setApellido("Rodriguez");
        emp3.setImportePorHora(600);
        emp3.setRetencionImpuesto(0.2);

        empresa.getEmpleados().add(emp3);

        System.out.println("Total de sueldos a pagar: "+empresa.calcularSueldoTotal(20));
    }
}

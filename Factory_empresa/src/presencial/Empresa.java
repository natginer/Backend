package presencial;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa(String razonSocial){
        this.razonSocial=razonSocial;
        empleados= new ArrayList<>();

        //agregar dos empleados que trabajan en este momento.
        EmpleadoRelacionDependencia emp1=(EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Rodriguez");
        emp1.setSueldoMensual(10000);

        EmpleadoContratado emp2=(EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp2.setNombre("Pedro");
        emp2.setApellido("Rodriguez");
        emp2.setImportePorHora(500);
        emp2.setRetencionImpuesto(0.1);

        empleados.add(emp1);
        empleados.add(emp2);
    }
    public double calcularSueldoTotal(int dias){
        //calcular el costo de sueldos de los empleados se acuerdo a un parámetro fijo en días.
        double total=0;
        for (Empleado emp:empleados) {
            total+=emp.calcularSueldo(dias);
        }
        return total;
    }
}

package examen;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Servicio>servicios;


    public Empresa(String nombre) {
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    public void addServicio(Servicio servicio){
        this.servicios.add(servicio);
    }

    public void generarInforme(){
        for (Servicio servicio:this.servicios) {
            System.out.println("Nombre: "+servicio.getNombre()+" - Precio: "+servicio.calcularPrecio());
        }
    }
}

package examen;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio{
    private List<Servicio> servicios = new ArrayList<>();
    private double descuento;

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        for(Servicio s : servicios){
            precioFinal += s.calcularPrecio();
        }
        return precioFinal - (precioFinal*this.descuento/100);
    }

    public void addServicio(Servicio servicio){
        servicios.add(servicio);
    }


    public List<Servicio> getServicios() {
        return servicios;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
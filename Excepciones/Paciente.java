package clase17;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion)
            throws FechaInternacionException
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;

        if (fechaInternacion.after(hoy))
            throw new FechaInternacionException("> Error en la fecha de internación.");

        this.fechaInternacion=fechaInternacion;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws FechaAltaException {
        if (fechaAlta.before(fechaInternacion))
            throw new FechaAltaException("> No es posible darse una fecha de alta anterior a la internación.");
        System.out.println("Ok");
    }



}

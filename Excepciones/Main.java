package clase17;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws FechaAltaException, FechaInternacionException {

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",
                    new Date(121, 9,19));

            try{ paciente.darAlta(new Date(121, 9, 20));
                System.out.println("Funca bien");}
            catch(FechaAltaException e){
                System.err.println(e.getMessage());
            }

        } catch(FechaInternacionException e) {
	        System.err.println(e.getMessage());
        }




    }
}

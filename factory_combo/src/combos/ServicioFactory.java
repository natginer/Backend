package examen;

public class ServicioFactory {
    private static ServicioFactory instance;

    private ServicioFactory(){

    }

    public static ServicioFactory getInstance(){
        if(instance == null){
            instance = new ServicioFactory();
        }
        return instance;
    }

    public Servicio crearServicio(String tipo){
        String compare = tipo.toLowerCase();
        switch (compare){
            case "simple":
                return new ServicioSimple();
            case "combo":
                return new Combo();
            default:
                return null;
        }
    }


}
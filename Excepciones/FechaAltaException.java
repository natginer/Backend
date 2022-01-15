package clase17;

public class FechaAltaException extends Exception {
    public FechaAltaException(){
        super();
    }
    public FechaAltaException(String message){
        super(message);
    }

    @Override
    public String toString(){
        return "> Error: La fecha de alta es posterior al día de la internación.";
    }

}

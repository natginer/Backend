package clase17;

public class FechaInternacionException extends Exception{
    public FechaInternacionException() {
        super();
    }

    public FechaInternacionException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return ">Error: Fecha de internación posterior al día de hoy";
    }
}

public class Final extends Examen implements Comparable{
    private  int notaOral;
    private String temaOral;

    public Final(String titulo, String enunciado, double nota, Alumno alumno, int notaOral, String temaOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado(){
        return (getNota()>=4 && notaOral>=4);
    }

    @Override
    public int compareTo(Object o){
        Final comp = (Final)o;
        int resp=0;
        double promedio = (notaOral+getNota())/2;
        double promedio2 = (comp.notaOral + comp.getNota())/2;
        // double promedio2 =(((Final)o).notaOral+((Final).o).getNota())/2;
        if (promedio>promedio2){
            resp=1;
        }
        if (promedio< promedio2){
            resp =-1;
        }
        return resp;
    }
}

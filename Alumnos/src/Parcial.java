public class Parcial extends Examen{
    private int unidad;
    private int nroDeReintento;

    public Parcial(String titulo, String enunciado, double nota, Alumno alumno, int unidad, int nroDeReintento) {
        super(titulo, enunciado, nota, alumno);
        this.unidad = unidad;
        this.nroDeReintento = nroDeReintento;
    }

    public boolean sePuedeRecuperar(){
        // 3 veces si la unidad es <=3 y 3 veces si es mayor a 3
        if (unidad<=3){
            return nroDeReintento<3;
        } else
            return nroDeReintento<2;
    }
}

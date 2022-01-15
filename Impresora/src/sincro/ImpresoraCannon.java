package sincro;

public class ImpresoraCannon extends Impresora{
    @Override
    public String imprimir() {
        return "Imprimiendo tus hojas con la calidad de Cannon";
    }

    @Override
    public boolean necesitaTinta(){
        return getPorcentajeTinta()<15;
    }
}

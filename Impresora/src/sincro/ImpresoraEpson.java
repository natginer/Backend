package sincro;

public class ImpresoraEpson extends Impresora{
    @Override
    public String imprimir() {
        return "Imprimiendo tus hojas con la calidad de Epson";
    }
    public void soloEpson(){
        System.out.println("Método solo de Epson");
    }
}

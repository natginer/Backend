package sincro;

public class Programa {
    public static void main(String[] args) {
        ImpresoraEpson i1= new ImpresoraEpson();
        System.out.println(i1.imprimir());
        ImpresoraCannon i2= new ImpresoraCannon();
        System.out.println(i2.imprimir());

        Object i3= new ImpresoraEpson();

        System.out.println(((Impresora)i3).imprimir());
        ((ImpresoraEpson)i3).soloEpson();
    }
}

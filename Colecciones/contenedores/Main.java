package mesas;

public class Main {
    public static void main(String[] args) {
        Puerto p = new Puerto("Buenos Aires");
        Contenedores c1 = new Contenedores(001, "China", true);
        Contenedores c2 = new Contenedores( 002, "Desconocido", false);
        Contenedores c3 = new Contenedores(003, "Desconocido", true);

        p.agregarContenedores(c1);
        p.agregarContenedores(c2);
        p.agregarContenedores(c3);

        p.mostrarContenedoresOrdenados();

        System.out.println("Peligrosos: " + p.cantContPeligrosos());

    }
}

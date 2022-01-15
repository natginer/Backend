public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new CajaDeAhorro(3000.0, "aaa012", 0.25);
        Cuenta c2= new CuentaCorriente(2000.0, "bbb011", 1000.0);
        c1.extraer(1500.0);
        System.out.println(c1.getSaldo());
        c1.extraer(1800.0);
        System.out.println(c1.getSaldo());
        c2.extraer(500.0);
        System.out.println(c2.getSaldo());
        c2.extraer(700.0);
        System.out.println(c2.getSaldo());

    }
}

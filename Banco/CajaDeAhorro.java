public class CajaDeAhorro extends  Cuenta{
    private double tasaDeInteres;

    public CajaDeAhorro(double saldo, String numeroCuenta, double tasaDeInteres) {
        super(saldo, numeroCuenta);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void extraer(double monto) {
        double saldo = getSaldo();
        if((saldo - monto) > 0){
            setSaldo( saldo-= monto);
        }else{
            System.out.println("Tu saldo es insuficiente. Proba montos inferiores a: $" + saldo);
        }
    }

    public void cobrarInteres(){
        double saldo = getSaldo();
        saldo *= tasaDeInteres;
        setSaldo(saldo);
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}

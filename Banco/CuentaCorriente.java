public class CuentaCorriente extends  Cuenta{
    private double descubierto;

    public CuentaCorriente(double saldo, String numeroCuenta, double descubierto) {
        super(saldo, numeroCuenta);
        this.descubierto = descubierto;
    }

    @Override
    public void extraer(double monto) {
        double saldoDisponible = getSaldo() + descubierto;
        if((saldoDisponible - monto) > 0){
            saldoDisponible -= monto;
            if(saldoDisponible < descubierto){
                descubierto = saldoDisponible;
                setSaldo(0);
            }else{
                setSaldo( saldoDisponible -= descubierto);
            }
        }else{
            System.out.println("Tu saldo es insuficiente. Proba montos inferiores a: $" + saldoDisponible );
        }
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
}
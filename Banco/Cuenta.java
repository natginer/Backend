public abstract class Cuenta {
    private Cliente cliente;
    private double saldo;
    private String numeroCUenta;



    public void depositar(double monto){
        saldo += monto;
    }

    public abstract void extraer(double monto);

    public double informarSaldo(){
        return saldo;
    }

    public Cuenta(double saldo, String numeroCuenta) {
        this.numeroCUenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

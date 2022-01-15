
public abstract class Cuenta {
	
	private double saldo;
	
	
	public void depositar(double monto) {
		saldo += monto;
	}
	public void depositar(double monto, double tipoDeCambio){
		saldo+=monto*tipoDeCambio;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double informarSaldo() {
		return saldo;
	}

	public abstract void extraer(double monto);

}

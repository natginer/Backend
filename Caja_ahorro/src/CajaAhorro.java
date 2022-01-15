
public class CajaAhorro extends Cuenta {
	//constante
	public static final double INTERES_CAJA_AHORRO = 1.2;
	public static final double MAX_DEP_CAJA=500000.0;
	
	@Override
	public void extraer(double monto) {
		if(informarSaldo() >= monto)
			setSaldo(informarSaldo() - monto);
		
	}

	public void cobrarIntereses() {
		setSaldo(informarSaldo() * INTERES_CAJA_AHORRO);
		
	}

	@Override
	public void depositar(double monto){
		if (monto<MAX_DEP_CAJA){
			setSaldo(informarSaldo()+monto);
		}
	}

}

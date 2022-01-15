
public class CuentaCorriente extends Cuenta implements GravadorImpuesto,Comparable{
	
	private double descubiertoPermitido;
	
	

	public double getDescubiertoPermitido() {
		return descubiertoPermitido;
	}



	public void setDescubiertoPermitido(double descubiertoPermitido) {
		this.descubiertoPermitido = descubiertoPermitido;
	}



	@Override
	public void extraer(double monto) {
		if(informarSaldo() + descubiertoPermitido >= monto)
			setSaldo(informarSaldo() - monto);
		
		
	}

	@Override
	public double gravar(double porcentaje) {
		double monto=informarSaldo()*porcentaje;
		setSaldo(informarSaldo()-monto);
		return monto;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

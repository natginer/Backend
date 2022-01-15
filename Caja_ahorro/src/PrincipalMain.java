
public class PrincipalMain {

	public static void main(String[] args) {

		Cuenta ca = new CajaAhorro();
		Cuenta auxca=ca;
		ca.depositar(100);
		ca.extraer(10);
		System.out.println("Saldo ca: "+ca.informarSaldo());
		ca=new CuentaCorriente();
		System.out.println("Saldo ca: "+ca.informarSaldo());

		Cuenta ca2= new CajaAhorro();
		System.out.println("Saldo ca2: "+ca2.informarSaldo());

		System.out.println("Saldo auxca: "+auxca.informarSaldo());
		ca= new CajaAhorro();
		System.out.println("Saldo ca: "+ca.informarSaldo());

		ca= auxca;
		System.out.println("Saldo ca: "+ca.informarSaldo());

		auxca.extraer(50);
		System.out.println("Saldo ca: "+ca.informarSaldo());
		if (ca instanceof CajaAhorro){
			((CajaAhorro)ca).cobrarIntereses();
		}

		
	}

}

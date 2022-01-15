
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

		Object cuentaComitente1 = new CuentaComitente();
		Cuenta cc1=(Cuenta) cuentaComitente1;
		cc1.depositar(1000);
		cc1.extraer(800);
		((CuentaComitente)cc1).setClave("BGF");
		((CuentaComitente)cc1).extraer(800,"BGF");
		System.out.println("Saldo CComitente1: "+cc1.informarSaldo());

		/*
		((CuentaComitente)cuentaComitente1).setClave("BGF");
		cuentaComitente1.depositar(1000);
		((CuentaComitente)cuentaComitente1).extraer(800,"BGF");
		System.out.println("Saldo CComitente1: "+cuentaComitente1.informarSaldo());
		*/
		
	}

}

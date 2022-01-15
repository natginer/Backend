public class CuentaComitente extends Cuenta{
    private String clave;

    public void setClave(String clave){
        this.clave=clave;
    }

    @Override
    public void extraer(double monto) {
        if (monto<=informarSaldo()){
            if(monto<=(informarSaldo()/2)) {
                setSaldo(informarSaldo() - monto);
            }
            else{
                System.out.println("No puede extraer más del 50% de su saldo sin utilizar su clave.");
            }
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }
    public void extraer(double monto, String clave){
        if (this.clave.equals(clave)){
            if(informarSaldo() >= monto) {
                setSaldo(informarSaldo() - monto);
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Clave incorrecta.");
        }
    }

    @Override
    public void depositar(double monto){
        setSaldo(informarSaldo()+(monto*0.99));
    }

    @Override
    public void depositar(double monto, double tipoDeCambio){
        setSaldo(informarSaldo()+(monto*tipoDeCambio*0.99));
    }
}

package SistemaBancario;

public class TarjetaDebito extends CuentaBase {

    public TarjetaDebito(double apertura) {
        super(apertura);
    }

    public double retirar(double cantidad){
        if(cantidad <= 0){
            System.out.println("Cantidad invalida para retiro");
        } else if(getMontoActual() >= cantidad){
            double nuevoSaldo = getMontoActual() - cantidad;
            setMontoActual(nuevoSaldo);
        } else {
            System.out.println("No cuentas con fondos suficientes");
        }
            return getMontoActual();
    }
}

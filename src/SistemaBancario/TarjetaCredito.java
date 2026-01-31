package SistemaBancario;

public class TarjetaCredito extends CuentaBase {
    private final double INTERES_PORCENTAJE = 0.15;
    
    public TarjetaCredito(double apertura) {
        super(apertura); 
    }
    
    public double sumarIntereses(){
        double saldoActual = getMontoActual();
        double interes = saldoActual * INTERES_PORCENTAJE;
        return interes;
    }
}


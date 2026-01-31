/**
* Angel Ricardo Ibañez Aceves
* 29/01/2026
* Programación orientada a objetos v1
* Claudia Patricia
 */
package SistemaBancario;

public class CuentaBase {
    private double montoActual;
   
    public CuentaBase(double apertura){
        this.montoActual = apertura;
    }
    
    public double depositar(double cantidad){
        if(cantidad > 0){
            this.montoActual += cantidad;
        }else{
            System.out.println("Cantidad inválida para deposito");
        }
        return this.montoActual;
    }
    
    public double getMontoActual(){
        return this.montoActual;
    }
        
    protected void setMontoActual(double cantidad){
        this.montoActual = cantidad;
    }
}

package SistemaBancario;

public class CuentaAhorro extends CuentaBase { 
    private final double RENDIMIENTO = 0.10;
    
    public CuentaAhorro(double apertura) {
        super(apertura); 
    }
    
    public double invertir(double cantidad){
         double rendimientos = 0;
         double nuevoSaldo = getMontoActual(); 
         
         if(cantidad <= 0){
             System.out.println("Cantidad invalida para invertir");
         } else {
             rendimientos = cantidad * RENDIMIENTO;
             nuevoSaldo = getMontoActual() + rendimientos;
             setMontoActual(nuevoSaldo);
             
             System.out.println("Rendimiento generado: $" + rendimientos);
             System.out.println("Nuevo monto tras inversion: $" + nuevoSaldo);
         }
         
         return nuevoSaldo; 
    }
}
package SistemaBancario;
import java.util.Scanner;

public class SistemaPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Sistema Bancario ***");

        // Tarjeta de debito
        System.out.println("\n--- Tarjeta de Debito ---");
        System.out.print("Monto de apertura: ");
        double apertura = sc.nextDouble();

        TarjetaDebito tarjetaDebito = new TarjetaDebito(apertura);

        System.out.println("Aperturaste tu cuenta con: $" + tarjetaDebito.getMontoActual());

        System.out.print("Cantidad a retirar: ");
        double retiro = sc.nextDouble();
        double saldoDebito = tarjetaDebito.retirar(retiro);
        System.out.println("Saldo final: $" + saldoDebito);

        // Tarjeta de Credito
        System.out.println("\n--- Tarjeta de Credito ---");
        System.out.print("Monto de apertura: ");
        double aperturaCredito = sc.nextDouble();

        TarjetaCredito tarjetaCredito = new TarjetaCredito(-aperturaCredito);
        double deuda = tarjetaCredito.sumarIntereses();
        System.out.println("Intereses: $" + deuda);

        // Cuenta de Ahorro
        System.out.println("\n--- Cuenta de Ahorro ---");
        System.out.print("Monto de apertura: ");
        double aperturaAhorro = sc.nextDouble();

        CuentaAhorro tarjetaAhorro = new CuentaAhorro(aperturaAhorro);
        double saldoAhorro = tarjetaAhorro.invertir(aperturaAhorro);
    }
}

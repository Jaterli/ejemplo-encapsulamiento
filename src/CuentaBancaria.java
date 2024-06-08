public class CuentaBancaria {
    // Atributos privados
    // final para que no pueda ser sobrescrito por las subclases
    private final String numeroCuenta;
    private double saldo;

    // Constructor para inicializar los atributos
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Método público para obtener el número de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // Método público para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método público para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + " euros. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método público para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + " euros. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }
}
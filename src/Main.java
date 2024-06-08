public class Main {
    public static void main(String[] args) {
        // Crear una cuenta bancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("12345678", 1000.0);

        // Mostrar el número de cuenta y el saldo inicial
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Realizar un depósito
        cuenta.depositar(200.0);

        // Realizar un retiro
        cuenta.retirar(150.0);

        // Intentar retirar una cantidad mayor al saldo disponible
        cuenta.retirar(2000.0);
    }
}
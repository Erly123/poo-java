package ch.l.sistemabancario;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaBruno = new CuentaCorriente("123", "Bruno Garcia");
        CuentaCorriente cuentaErly = new CuentaCorriente("123", "Erly Choqque");

        cuentaBruno.depositar(100);
        cuentaErly.depositar(20);

        cuentaBruno.verSaldo();
        cuentaErly.verSaldo();

        cuentaBruno.transferir(50, cuentaErly);

        cuentaBruno.verSaldo();
        cuentaErly.verSaldo();

    }
}

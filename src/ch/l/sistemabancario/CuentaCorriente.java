package ch.l.sistemabancario;

public class CuentaCorriente {
    private String cpf;
    private String nombreCompleto;
    private double saldo;

    public CuentaCorriente(String cpf, String nombreCompleto) {
        this.cpf = cpf;
        this.nombreCompleto = nombreCompleto;
        this.saldo = 0;
    }
    public double verSaldo() {
        System.out.println("Saldo de la cuenta de " + this.nombreCompleto + " es: S/ "+ this.saldo);
        return this.saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public void transferir(double valor, CuentaCorriente ccDestino) {
        sacar(valor);
        ccDestino.depositar(valor);
        System.out.println("Transferencia realizada de "+ this.nombreCompleto + " para " + ccDestino.getNombreCompleto()  +
                " el valor de S/ "+ valor);
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
}

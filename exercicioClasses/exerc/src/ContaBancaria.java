public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0f;
    }

    public void depositar(double valor) {
        if (valor > 0)
            saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor)
            saldo -= valor;

    }

    public String imprimirSaldo() {
        return "Saldo: " + this.saldo;
    }
}
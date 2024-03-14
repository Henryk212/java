package pacote;

public class ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private float saldo;

    public ContaBancaria(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0f;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNomeDoTitular() {
        return this.nomeDoTitular;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public float depositar(float valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso" + "\nSaldo atual: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria [numeroDaConta=" + numeroDaConta + ", nomeDoTitular=" + nomeDoTitular + ", saldo=" + saldo
                + "]";
    }
}

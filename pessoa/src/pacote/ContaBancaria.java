package pacote;

public class ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private float saldo;

    public ContaBancaria(int numeroDaConta, String nomeDoTitular, float saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
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
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public float depositar(float valor) {
        this.saldo += valor;
        return this.saldo;
    }
    public float sacar(float valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}
   

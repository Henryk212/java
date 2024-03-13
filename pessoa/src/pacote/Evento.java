package pacote;

public class Evento {
    private String nome;
    private String data;
    private float precoIngreco;
    private int quantidadeIngressos;
    private int ingressosVendidos;

    public float venderIngresso(int quantidade) {
        if (quantidade <= this.quantidadeIngressos) {
            this.ingressosVendidos += quantidade;
            this.quantidadeIngressos -= quantidade;
            return quantidade * this.precoIngreco;
        }
        return 0;
    }

    public float verArrecadacao() {
        return this.ingressosVendidos * this.precoIngreco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }
    public void setPrecoIngreco(float precoIngreco) {
        this.precoIngreco = precoIngreco;
    }
    public float getPrecoIngreco() {
        return this.precoIngreco;
    }
    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }
    public int getQuantidadeIngressos() {
        return this.quantidadeIngressos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
    public int getIngressosVendidos() {
        return this.ingressosVendidos;
    }

}

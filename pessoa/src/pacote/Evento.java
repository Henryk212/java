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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPrecoIngreco() {
        return precoIngreco;
    }

    public void setPrecoIngreco(float precoIngreco) {
        this.precoIngreco = precoIngreco;
    }

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", data=" + data + ", precoIngreco=" + precoIngreco + ", quantidadeIngressos="
                + quantidadeIngressos + ", ingressosVendidos=" + ingressosVendidos + "]";
    }

   
  

}

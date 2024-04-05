public class Produto {
    private int codigo;
    private String nome;
    private Float preco;

    
    public Produto(int codigo, String nome, Float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Float getPreco() {
        return preco;
    }


    public void setPreco(Float preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produto [codigo= S" + codigo + ", nome= " + nome + ", preco= " + preco + "]";
    }

    
}

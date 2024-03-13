package pacote;
public class Pessoa {

    String nome;
    public String sobreNome;
    private int ddd;
    protected int telefone;

    public Pessoa(String nome, String sobreNome, int ddd, int telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.ddd = ddd;
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public String getSobreNome() {
        return this.sobreNome;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public int getDdd() {
        return this.ddd;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "Pessoa [ddd=" + ddd + ", nome=" + nome + ", sobreNome=" + sobreNome + ", telefone=" + telefone + "]";
    }
  
}
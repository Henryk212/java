public class Funcionario {
    private String nome, cpf, cargo;
    private int idade;
    
    public Funcionario(String nome, String cpf, String cargo, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", cargo=" + cargo + ", idade=" + idade + "]";
    }

    
}

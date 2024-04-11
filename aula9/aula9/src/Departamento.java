import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    
    public Departamento(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public Funcionario buscraFuncionarioPorCpf(String cpf){
        return funcionarios.stream().filter(f -> f.getCpf().equals(cpf)).findFirst().orElse(null);
    }
    public Funcionario buscraFuncionarioPorNome(String nome){
        return funcionarios.stream().filter(f -> f.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void adicionarFuncionario(Funcionario funcionario){
        if(buscraFuncionarioPorCpf(funcionario.getCpf()) == null){
            funcionarios.add(funcionario);
        }
    }

    public void removerFuncionario(String cpf){
        funcionarios.remove(buscraFuncionarioPorCpf(cpf));
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }


    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }

    
}

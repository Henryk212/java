import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;
    private List<Funcionario> funcionarios;

    public Empresa(List<Departamento> departamentos, List<Funcionario> funcionarios) {
        this.departamentos = departamentos;
        this.funcionarios = funcionarios;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public Funcionario buscraFuncionarioPorNome(String nome){
        return funcionarios.stream().filter(f -> f.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void adicionarFuncionarioPorNome(Funcionario nome){
        if(buscraFuncionarioPorNome(nome.getNome()) == null){
            funcionarios.add(nome);
        }

    }




    @Override
    public String toString() {
        return "Empresa [departamentos=" + departamentos + "]";
    }

    

    
}

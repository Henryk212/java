import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;

    public Empresa(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Departamento buscarDepartamento(String nome){
        return departamentos.stream().filter(d -> d.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void adicionarDepartamento(Departamento dep){
        if(buscarDepartamento(dep.getNome()) == null){
            departamentos.add(dep);
        }
    }
    public void remverDepartamento(String nome){
        departamentos.remove(buscarDepartamento(nome));
    }

    public Funcionario buscarFuncionarioPorCpf(String cpf){
        Funcionario fun = null;
        for (Departamento dep : departamentos) {
            fun = dep.buscraFuncionarioPorCpf(cpf);
        }
        return fun;   
    }

    public void adicionarFuncionario(Funcionario func, String nomeDep){
        Departamento dep = buscarDepartamento(nomeDep);
        if(buscarFuncionarioPorCpf(func.getCpf()) == null && dep != null){
            dep.adicionarFuncionario(func);
        }
    }
    
    public void removerFuncionario(String cpf){
        for (Departamento dep : departamentos) {
            dep.getFuncionarios().remove(buscarFuncionarioPorCpf(cpf));
        }
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    


    @Override
    public String toString() {
        return "Empresa [departamentos=" + departamentos + "]";
    }

    

    
}

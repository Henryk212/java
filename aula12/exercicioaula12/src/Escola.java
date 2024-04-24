import java.util.List;

public class Escola {
   private List<Aluno> alunos; 
   private List<Professor> professores; 
   private List<Funcionario> funcionarios;
        
   public Escola() {} 

   public Professor buscarProfessor(String nome){
        return professores.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
}
   public Funcionario buscarFuncionario(String nome){
        return funcionarios.stream().filter(f -> f.getNome().equals(nome)).findFirst().orElse(null);
}
   public Aluno buscarAluno(String nome){
        return alunos.stream().filter(a -> a.getNome().equals(nome)).findFirst().orElse(null);
}

public List<Aluno> getAlunos() {
    return alunos;
}

public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
}

public List<Professor> getProfessores() {
    return professores;
}

public void setProfessores(List<Professor> professores) {
    this.professores = professores;
}

public List<Funcionario> getFuncionarios() {
    return funcionarios;
}

public void setFuncionarios(List<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
}

@Override
public String toString() {
    return "Escola [alunos=" + alunos + ", professores=" + professores + ", funcionarios=" + funcionarios + "]";
}

   
}

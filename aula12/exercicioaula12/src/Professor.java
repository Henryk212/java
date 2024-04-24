import escola.Pessoa;

public class Professor extends Pessoa {

    private String disciplina;
    private float salario;
    
    public Professor(String nome, String endereco, int idade,String disciplina, float salario ){
        super(nome, endereco, idade);
        this.disciplina = disciplina;
        this.salario = salario;

    }

    public void aumentarSalario(int procentagem){
        procentagem = (procentagem/100) + 1;
        this.salario *=procentagem;
        // this.salario = this.salario * (procentagem/100) + this.salario;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + ", salario=" + salario + "]";
    }

    
}

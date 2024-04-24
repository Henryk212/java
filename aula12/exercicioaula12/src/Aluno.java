import escola.Pessoa;

public class Aluno extends Pessoa {

    private String curso;
    private int matricula;
    private float nota;
    
    public Aluno(String nome, String endereco, int idade, String curso, int matricula, float nota){
        super(nome, endereco, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.nota = nota;
    }

    public boolean situacao(float nota){
        if(nota >= 6){
            return true;
        }else {
            return false;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + ", nota=" + nota + "]";
    }

    
}

package pacote;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String email;

    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.dataNascimento = LocalDate.now();
        this.email = "";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    private int idade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    private boolean validaEmail(String email) {
        return email.contains("@") && email.indexOf("@") < email.lastIndexOf(".");
    }

    public void adicionarEmail(String email) {
        if (validaEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email inválido.");
        }
    }

    public String getInformacoes() {
        return "Nome: " + nome + ", Sobrenome: " + sobrenome + ", Idade: " + idade() + ", Email: " + email;
    }

    public boolean maior() {
        return idade() >= 18;
    }
}
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public void devolverLivros(List<Livro> livros){
        livros.forEach(livro -> this.livros.forEach(l -> {
            if(l.getNome().equals(livro.getNome())){

            }
        }))}

    public Livro buscarLivro(String titulo){
        return livros.stream().filter(l -> l.getNome().equals(titulo)).findFirst().orElse(null);
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    @Override
    public String toString() {
        return "Biblioteca [nome=" + nome + ", livros=" + livros + "]";
    }

    

    
}

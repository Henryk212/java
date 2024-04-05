import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        if(buscarContatoPorNome(contato.getNome()) == null){
            contatos.add(contato);
        }
    }
    public Contato buscarContatoPorNome(String nome){
        for(Contato contato : contatos){
            if(contato.getNome().toLowerCase().equals(nome.toLowerCase())){
                return contato;
            }
        }
        return null;
    } 
    
    public void removerContato(String nome){
        Contato contato = buscarContatoPorNome(nome);
        if(contato != null){
            contatos.remove(contato);
        }
    }

    @Override
    public String toString() {
        return "Agenda [contatos= " + contatos + "]";
    }

    
}

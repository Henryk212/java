import animal.Animal;

public class Gato extends Animal {
    
    public Gato(String nome, String som){
        super.nome =  nome;
        super.som = som;
        super.fome = true;
        super.dormindo = true;

    }

    @Override
    public String toString() {
        return "Gato [nome: " + super.getNome() + "som: " + super.getSom() + "dormindo ? " + dormindo + "Fome ? " + fome + "]";
    }

    
}

import animal.Animal;

public class Cachorro extends Animal {

    @Override
    public String toString() {
       return "Cachorro [nome: " + super.getNome() + "som: " + super.getSom() + "dormindo ? " + dormindo + "Fome ? " + fome + "]";

    }
    
   
}




package animal;

public class Animal {
    protected String nome, som;
    protected boolean dormindo, fome;

    public String emitirSom(){
        return "Som: " + som;
    }

    public void comer(){
        fome = false;
    }
    public void dormir(){
        dormindo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

}

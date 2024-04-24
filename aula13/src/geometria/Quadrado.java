package geometria;


public class Quadrado extends Formas {
    private String cor;

    
    public Quadrado() {
        
    }
    
    public Quadrado(float base, float altura, String cor) {
        super(base, altura);
        this.cor = cor;
    }

    public Quadrado(float base, float altura) {
        super(base, altura);
    }

    
    @Override
    public String calcularArea() {
        float calculo = base * altura;
        return "O calculo da área é: " + calculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Quadrado [cor=" + cor + "]";
    }
    
}

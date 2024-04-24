package geometria;

public abstract class Formas {
    protected float base, altura;

    public Formas(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    

    public Formas() {
    }

    public abstract String calcularArea();

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public abstract String toString();

    
}

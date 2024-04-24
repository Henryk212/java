package geometria;

public class Circulo extends Formas {
    private float circunferencia;

    
    public Circulo() {
    }

    public Circulo(float base) {
        super(base, 3.14f);
        calcularCircunferencia();
    }

    @Override
    public String calcularArea() {
        double calculo = 3.14 *( base * altura);
        return "O calculo da área é: " + calculo;
    }

    public String calcularCircunferencia(){
        double calculo = ( base * altura);
        return "O calculo da área é: " + calculo;
    }

    public float getCircunferencia() {
        return circunferencia;
    }


    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }


    @Override
    public String toString() {
        return "Circulo [circunferencia=" + circunferencia + "]";
    }

    

    
}

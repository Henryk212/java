package util;

public abstract class Util {


    

    public String  calcularArea(float base, float a, float b){
        float calculo = base* a / b;
    
        return "O calculo da área é: " + calculo;
    }

    public String  calcularAreaCirculo( double a, double b){
        double calculo = 3.14 *( a * b);
    
        return "O calculo da área é: " + calculo;
    }


    public void calcularCircunferencia(){

    }
}

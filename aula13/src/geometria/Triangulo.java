package geometria;

public class Triangulo extends Formas {
  private String tipo;

public Triangulo(String tipo) {
    this.tipo = tipo;
}


public Triangulo() {
}


@Override
public String calcularArea() {
    float calculo = ((base * altura) / 2);
    
    return "O calculo da área é: " + calculo;
}


public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

@Override
public String toString() {
    return "Triangulo [tipo=" + tipo + "]";
}
  
  
}

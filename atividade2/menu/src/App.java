import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float resultado;
        float num1, num2, val1, val2;
        int res,cod1,cod2, ipi, quant1, quant2;
        Boolean menu;
        Scanner entradaDeDados = new Scanner(System.in);
        menu = true;
        do {
            System.out.println("Deseja realizar algum calculo ?");
            System.out.println("###########");
            System.out.println("1 para somar");
            System.out.println("2 para subtrair");
            System.out.println("3 para multiplicar");
            System.out.println("4 para dividir");
            System.out.println("5 para Potencia");
            System.out.println("6 para IPI");
            System.out.println("0 para sair do menu");
            res = entradaDeDados.nextInt();
            switch (res) {
                case 1:
                    System.out.println("Informe o primeiro numero");
                    num1 = entradaDeDados.nextFloat();
                    System.out.println("Informe o segundo numero");
                    num2 = entradaDeDados.nextFloat();
                    resultado = num1 + num2;
                    System.out.println("O valor da soma é" + resultado);
                    break;
                case 2:
                    System.out.println("Informe o primeiro numero");
                    num1 = entradaDeDados.nextFloat();
                    System.out.println("Informe o segundo numero");
                    num2 = entradaDeDados.nextFloat();
                    resultado = num1 - num2;
                    System.out.println("O valor da subtração é" + resultado);
                    break;
                case 3:
                    System.out.println("Informe o primeiro numero");
                    num1 = entradaDeDados.nextFloat();
                    System.out.println("Informe o segundo numero");
                    num2 = entradaDeDados.nextFloat();
                    resultado = num1 * num2;
                    System.out.println("O valor da Multiplicação é" + resultado);
                    break;
                case 4:
                    System.out.println("Informe o primeiro numero");
                    num1 = entradaDeDados.nextFloat();
                    System.out.println("Informe o segundo numero");
                    num2 = entradaDeDados.nextFloat();
                    resultado = num1 / num2;
                    System.out.println("O valor da divisão é" + resultado);
                    break;
                case 5:
                    System.out.println("Informe o primeiro numero");
                    num1 = entradaDeDados.nextFloat();
                    System.out.println("Informe o segundo numero");
                    num2 = (int) entradaDeDados.nextFloat();
                    for (float controle = num1; num2 > 1; num2--) {
                        num1 *= controle;
                    }
                    System.out.println("O valor da divisão é" + num1);
                    break;
                case 6:
                System.out.println("Informe ipi");
                ipi = entradaDeDados.nextInt();
                System.out.println("Informe Código do produto 1");
                cod1 = entradaDeDados.nextInt();
                System.out.println("Informe a quantidade produto 1");
                quant1 = entradaDeDados.nextInt();
                System.out.println("Informe o valor do produto 1");
                val1 = entradaDeDados.nextFloat();
                System.out.println("Informe ipi");
                ipi = entradaDeDados.nextInt();
                System.out.println("Informe Código do produto 2");
                cod2 = entradaDeDados.nextInt();
                System.out.println("Informe a quantidade produto 2");
                quant2 = entradaDeDados.nextInt();
                System.out.println("Informe o valor do produto 2");
                val2 = entradaDeDados.nextFloat();

                // System.out.println(
                //     "Produto 1" + cod1 + "Valor" + val1 + "quantidade" + quant1 +
                //     "produto 2" + cod2 +  "valor" + val2 + "quantidade" + quant2+ ; 
                // );
                  
                    System.out.println("O valor da divisão é" + num1);
                    break;
                case 0:
                    System.out.println("até a proxima");
                    menu = false;
                    break;

                default:
                    System.out.println("digito invalido");
                    break;
            }
        } while (menu);

    }

    public static float receberFloat(){
        System.out.println("Digite um valor");    
        Scanner entrada = new Scanner(System.in);
        float res = entrada.nextFloat();
        return res;
    }
}

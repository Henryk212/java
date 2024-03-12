import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradaDeDados = new Scanner(System.in);
        int fatorial, ddd, telefone;
        String nome, sobrenome;
        int vetorInteiro[] = new int[5];
        float vetorFloat[] = new float[5];

        System.out.println(retornaPi());
        System.out.println(fatorial());
        System.out.println("Exercicio 3");

        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.println("Digite o " + (i + 1) + "numero");
            vetorInteiro[i] = entradaDeDados.nextInt();
        }
        System.out.println("O maior numero do vetor é " + maiorNumero(vetorInteiro));
        System.out.println("Exercicio 4");

        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.println("Digite o " + (i + 1) + "numero");
            vetorFloat[i] = entradaDeDados.nextFloat();
        }
        System.out.println("O maior numero do vetor é " + somaVetor(vetorFloat));
    }

    public static float retornaPi() {
        return 3.14f;
    }

    public static int fatorial() {

        int fatorial = 10;
        for (int i = fatorial - 1; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int maiorNumero(int[] vetor) {
        int resultado = vetor[0];
        for (int v : vetor) {
            if (v > resultado)
                resultado = v;
        }
        return resultado;
    }
    public static float somaVetor(float[] res) {
        float resultado = 0;
        for (int v : res) {
            
        }
        return resultado;
    }

}

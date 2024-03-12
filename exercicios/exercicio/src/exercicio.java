import java.util.Scanner;

public class exercicio {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        ex02();

    }

    public static void ex01() {

        int[] vetor = new int[5];
        int[] vetorMenor = new int[5];
        int[] vetorIgual = new int[5];
        int[] vetorMaior = new int[5];
        float media = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME UM VALOR: ");
            vetor[i] = leitor.nextInt();
            media += vetor[i];
        }
        media /= 5;
    }

    public static void ex02(){

        int a;

        System.out.print("INFORME O TAMANHO DO VETOR: ");
        a = leitor.nextInt();
        int[] vetor = new int [a];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0){
                System.out.println( (i+1) + " " + vetor[i] + " MAIOR QUE ZERO\n");
            }
            else if (vetor[i] == 0){
                System.out.println( (i+1) + " " + vetor[i] + "IGUAL A ZERO\n");
            }
            else {
                System.out.println( (i+1) + " " + vetor[i] + " MENOR QUE ZERO\n");
            }
        }
    }
}
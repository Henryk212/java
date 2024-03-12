import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * next() Serve para receber uma palavra
         * nextLine() Serve para receber um texto
         * nextInt() Serve para receber um inteiro
         * nextFloat() Serve para receber um float
         * nextLong() Serve para receber um long
         * nextBoolean() Serve para receber um bopleano
         */

        Scanner entradaDeDados = new Scanner(System.in);

        int a = 5;
        int b = 10;
        int soma, subitracao, multiplicacao, restoDivisao, dataNascimento, idade;
        float divisao;

        System.out.println("Aula de estruturas condicionais");

        soma = a + b;
        subitracao = b - a;
        multiplicacao = a * b;
        divisao = b / a;
        restoDivisao = b % a;

        System.out.println("Soma = " + soma);
        System.out.println("subtração = " + subitracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Resto da divisão = " + restoDivisao);
        // Incrementos
        System.out.println("Incremento após" + a++);
        System.out.println("Incremento antes" + ++b);
        // Decrementos
        System.out.println("Decremento após" + a--);
        System.out.println("Decremento antes" + --b);

        // Estrutura de controle condicionais

        if (b == 10) {
            System.out.println("B é igual a 10");
        } else if (a == 5) {
            System.out.println("A é igual a 5");
        } else {
            System.out.println("nenhum dos casos");
        }

        switch (a) {
            case 10:
                System.out.println("A é igual a 10");
                break;
            case 5:
                System.out.println("A é igual a 5");
                break;
            case 2:
                System.out.println("A é igual a 2");
            default:
                System.out.println("Nenhum dos casos");
                break;
        }

        System.out.println("Informe seu ano de nascimento");

        dataNascimento = entradaDeDados.nextInt();
        idade = 2024 - dataNascimento;

        if (idade >= 18) {
            System.out.println("Você é maior de 18 anos");
        } else {
            System.out.println("Você é menor de 18 anos");
        }
        
        System.out.println("Você é " + ((idade >= 18)? "Maior de 18 anos" : "menor de 18 anos"));



        System.out.println("############################");

        // laços de Repetição

        // while (a <= 10) {
        //     System.out.println("A é igual a " + ++a);
        // }
        // int ksd = 5;
        // do {
        //     System.out.println("A é igual a " + ksd++);
        // }while (ksd >= 5);

        for(int cont = 0; cont <= 10; cont++){
            System.out.println("cont" + cont);
            
        }

        int vet[] = {7,6,8,9,3,1};
        System.out.println("Primeira posição é " + vet[0]);
        for(int i = 0; i < vet.length; i++){
            System.out.println("Vetor posição" + i + "é igual a" + vet[i]);
        }

        for(int v: vet){
            System.out.println("O VALOR É" + v);
        }

    }
}

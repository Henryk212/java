import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        float media, nota1, nota2, nota3, nota4, soma;
        int resp;

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Vamos verificar se você foi aprovado ? Responda com 1/0");
        resp = entradaDeDados.nextInt();

        if (resp == 1) {
            System.out.println("Informe a primeira nota: ");
            nota1 = entradaDeDados.nextFloat();
            System.out.println("Informe a Segunda nota: ");
            nota2 = entradaDeDados.nextFloat();
            System.out.println("Informe a terceira nota: ");
            nota3 = entradaDeDados.nextFloat();
            System.out.println("Informe a quarta nota: ");
            nota4 = entradaDeDados.nextFloat();

            soma = nota1 + nota2 + nota3 + nota4;

            media = soma / 4;

            if (media >= 6) {
                System.out.println("Voce Foi aprovado, parabéns !! sua média foi de:" + media);
            } else {
                System.out.println("Você reprovou !!");
            }
        } else {
            System.out.println("Que Pena até a próxima");

        }
        

    }
}

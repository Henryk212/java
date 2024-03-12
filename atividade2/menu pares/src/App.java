import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int res;
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        Boolean menu;
        Scanner entradaDeDados = new Scanner(System.in);
        
        menu = true;
        
            System.out.println("Deseja ver os numeros pares ou impares ?");
            System.out.println("###########");
            System.out.println("1 para par");
            System.out.println("2 para impar");
            System.out.println("0 para sair do menu");
            res = entradaDeDados.nextInt();
            
            if(res == 1)
            {
                System.out.println("Números pares: ");
                for (int i = 0; i < vetor.length; i++)
                {
                    if (vetor[i] % 2 == 0)
                    {
                        System.out.println(vetor[i] + ", ");
                    }
                }
            
        }else if (res == 2)
        {
        System.out.println("Números ímpares: ");
            for (int i = 0; i < vetor.length; i++)
                {
                    if (vetor[i] % 2 != 0)
                    {
                        System.out.println(vetor[i] + ", ");
                    }
                }
        }
        else
        {
            System.out.println("Escolha inválida.");
        }
    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import pacote.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa = new Pessoa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        pessoa.setNome(entrada.nextLine());

        System.out.println("Digite o sobrenome: ");
        pessoa.setSobrenome(entrada.nextLine());

        System.out.println("Digite a data de nascimento (yyyy-mm-dd): ");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(entrada.nextLine(), formatador);
        pessoa.setDataNascimento(data);

        System.out.println("Digite o email: ");
        pessoa.adicionarEmail(entrada.nextLine());

        System.out.println(pessoa.getInformacoes());

        if (pessoa.maior()) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        System.out.println("Maior de idade? " + pessoa.maior());

        entrada.close();
    }
}

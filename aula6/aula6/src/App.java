import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatador);
        System.out.println("Data atual: " + dataFormatada);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma data no formato: dd/mm/aaaa:");
        String data = entrada.nextLine();

        try {
            LocalDate dataInformada = LocalDate.parse(data, formatador);
            System.out.println("Data informada: " + dataInformada.format(formatador));
        } catch (Exception e) {
            System.out.println("Data inválida");
        }

        // manipulando Strings

        String texto = "  Olá, mundo!  ";

        System.out.println("Texto original: " + texto);
        System.out.println("Texto sem espaços: " + texto.trim());
        System.out.println("Texto em maiúsculas: " + texto.toUpperCase());
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());
        System.out.println("Tamanho do texto: " + texto.length());
        System.out.println("Texto substituindo: " + texto.replace("mundo", "Brasil"));
        System.out.println("Dividindo Strings: " + texto.substring(5, 9));
        System.out.println("Texto contém 'mundo'?: " + texto.contains("mundo"));
        System.out.println("Inicio com 'Olá'?: " + texto.startsWith("Olá"));
        System.out.println("Final com 'Olá'?: " + texto.endsWith("ola"));
        System.out.println("Posição da palavra 'mundo': " + texto.indexOf("mundo"));
        System.out.println("Ultima posição da palavra 'mundo': " + texto.lastIndexOf("mundo"));
        System.out.println("Substituindo espaços por '_': " + texto.replaceAll(" ", "_"));
        System.out.println("Texto dividido por espaços: " + texto.split(","));
        
        String cpf = "123.456.789-00";
        String cpfApenasDigitos = cpf.replaceAll("\\D", "");
        System.out.println("CPF apenas dígitos: " + cpfApenasDigitos);
        String cpfFormatado = cpfApenasDigitos.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        System.out.println("CPF formatado: " + cpfFormatado);

        System.out.println("Digite uma data:");
        String data2 = entrada.nextLine();
        String[] partes = {"\\\\", "/", "-", " ", "."};
        for (String separador : partes) {
            String[] dataSeparada = data2.split(separador);
            if (dataSeparada.length == 3) {
                System.out.println("Data separada: " + dataSeparada[0] + "/" + dataSeparada[1] + "/" + dataSeparada[2]);
                break;
            }
        }
    }
}

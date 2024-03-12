public class App {

    public static void main(String[] args) {
        System.out.println("#####################");
        System.out.println("Exercicio 1");

        Pessoa pessoa = new Pessoa("Fulano", 30);
        System.out.println(pessoa.apresentar());

        System.out.println("#####################");
        System.out.println("Exercicio 2");

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1993);
        System.out.println(livro.informacoes());
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1993);
        System.out.println(livro2.informacoes());

        System.out.println("#####################");
        System.out.println("Exercicio 3");

        ContaBancaria conta = new ContaBancaria("Henrique Onorato", 123);
        conta.depositar(1000);
        System.out.println(conta.imprimirSaldo());
        conta.sacar(200);
        System.out.println(conta.imprimirSaldo());

        System.out.println("#####################");
        System.out.println("Exercicio 4");

        Triangulo triangulo = new Triangulo(25, 30);
        System.out.println(triangulo.area());

        System.out.println("#####################");
        System.out.println("Exercicio 5");

        Cafeteira cafeteira = new Cafeteira();
        cafeteira.encherAgua(30);
        cafeteira.encherCafe(14);
        cafeteira.ligar();
        System.out.println(cafeteira.status());

        if (cafeteira.fazerCafe()) {
            System.out.println("Café feito!");
        } else {
            System.out.println("Café não feito!");
        }

    }
}

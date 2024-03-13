import pacote.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Encapsulamento");

        Pessoa pessoa = new Pessoa("João", "Silva", 11, 999999999);
        
        pessoa.sobreNome = "Silva";
        pessoa.setDdd(41);
        pessoa.setTelefone(888888888);

        System.out.println(pessoa.getDdd());
    }
}

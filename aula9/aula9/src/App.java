import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    Agenda agenda = new Agenda();
    
    agenda.adicionarContato(new Contato("Henrique Moraes", "41999755209"));
    agenda.adicionarContato(new Contato("Henrique Onorato", "41999755209"));
    agenda.adicionarContato(new Contato("Henrique Moraes Onorato", "41999755209"));
    System.out.println(agenda);
    agenda.removerContato("Henrique Moraes");
    System.out.println(agenda);

    // Produto produto1 = new Produto(1, "Chocolate", 10.5f);

    // System.out.println(produto1);    

    CadastrarProduto havan = new CadastrarProduto(new ArrayList<Produto>());

    havan.adicionarProduto(new Produto( "Chocolate", 10.5f));
    havan.adicionarProduto(new Produto( "Canivete", 150.5f));
    havan.adicionarProduto(new Produto( "Mochila", 100.5f));
    havan.adicionarProduto(new Produto("caneta", 1.5f));
    havan.adicionarProduto(new Produto( "Molho de alho", 6.5f));

    System.out.println(havan);

    havan.removerProduto(4);

    System.out.println(havan);

    Funcionario fun1 = new Funcionario("HEnrique", "98765431", "Lider tech", 30);
    Funcionario fun2 = new Funcionario("HEnrique 9", "98788931", "Lider tech 2", 30);
    Funcionario fun3 = new Funcionario("HEnrique 10", "654654654", "Lider tech 3", 30);
    Funcionario fun4 = new Funcionario("HEnrique 11", "56465456", "Lider tech 4", 30);

    Departamento departamento1 = new Departamento("Adm",new ArrayList<Funcionario>());
    Departamento departamento2 = new Departamento("Financeiro",new ArrayList<Funcionario>());
    Departamento departamento3 = new Departamento("Desenvolvimento",new ArrayList<Funcionario>());

    Empresa empresa = new Empresa(new ArrayList<Departamento>());
    
    empresa.adicionarDepartamento(departamento3);
    empresa.adicionarDepartamento(departamento2);
    empresa.adicionarDepartamento(departamento1);

    empresa.adicionarFuncionario(fun4, "Desenvolvimento");
    empresa.adicionarFuncionario(fun2, "Financeiro");
    empresa.adicionarFuncionario(fun3, "Adm");
    empresa.adicionarFuncionario(fun1, "Desenvolvimento");

    System.out.println(empresa);

    System.out.println(departamento1);
    

    }
}


// A classe Contato deve ter os atributos nome e telefone.
// • A classe Agenda deve gerenciar uma lista de contatos e ter métodos paraadicionar, 
// remover e buscar contatos por nome.• Deve implementar validação para evitar contatos duplicados


// Produtos
// • A classe Produto deve ter os atributos código, nome e preço.
// • A classe CadastroProdutos deve gerenciar uma lista de produtos e ter métodos para adicionar, remover e buscar produtos por código.
// • Deve implementar validação para evitar produtos com o mesmo nome.
// • Deve implementar método para gerar o código do produto automa􀆟camente.
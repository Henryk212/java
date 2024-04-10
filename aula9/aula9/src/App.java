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
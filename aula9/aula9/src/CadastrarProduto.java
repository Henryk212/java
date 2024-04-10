import java.util.List;

public class CadastrarProduto {
    
    private List<Produto> produtos;

    public CadastrarProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }


    private int criarCodigo(){
        int res = 0;
        for(Produto p: produtos){
            if(res <= p.getCodigo()  ){
                res = p.getCodigo();
            }

        }
        return ++res;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto){
        produto.setCodigo(criarCodigo());

        if(buscarProdutoPorId(produto.getCodigo()) == null && buscarProdutoPorNome(produto.getNome()) == null){
            produtos.add(produto);
        }
        
    } 

    public void removerProduto(int codigo){
        produtos.remove(buscarProdutoPorId(codigo));
    }

    public Produto buscarProdutoPorId(int codigo){
        return produtos.stream().filter(p -> p.getCodigo() == codigo).findFirst().orElse(null);
    }

    public Produto buscarProdutoPorNome(String nome){
        return produtos.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }


    @Override
    public String toString() {
        return "CadastrarProduto [produtos=" + produtos + "]";
    }

  

   
      
} 

    




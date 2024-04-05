import java.util.ArrayList;
import java.util.List;

public class CadastrarProduto {
    
    private List<Produto> produtos;

    public CadastrarProduto() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto){
        if(!produtos.contains(produto.getCodigo())){
            produtos.add(produto);
            System.out.println("Produto Adicionado com sucesso");
        }else{
            System.out.println("Erro ao criar produto");
        }
        
    } 

   
      
} 

    




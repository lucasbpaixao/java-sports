package Model;

public class ProdutoVO {

    private int id;
    private String produto;
    private double preco;
    private int quantidade;
    private int quantidadeVendida;

    public ProdutoVO(String Produto, double preco, int quantidade, int quantidadeVendida, int id) {
        this.produto = Produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.quantidadeVendida = quantidadeVendida;
        this.id = id;
       
    }

 
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto + " : " + preco + " : " + quantidade;

    }
    
    
}

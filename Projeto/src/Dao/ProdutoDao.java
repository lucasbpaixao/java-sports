package Dao;

import Model.ProdutoVO;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    static ArrayList<ProdutoVO> produto = new ArrayList();

    public void cadastroDeProdutos(ProdutoVO contato) {
        contato.setId(produto.size() + 1);
        produto.add(contato);
    }

    public String numeroDeCadastros() {

        return produto.size() + "";
    }

    public void excluir(int deletar) {
        produto.remove(deletar);
    }

    public void alterar(int tirar, ProdutoVO telinha) {

        produto.get(tirar).setPreco(telinha.getPreco());
        produto.get(tirar).setProduto(telinha.getProduto());
        produto.get(tirar).setQuantidade(telinha.getQuantidade());

    }

    public List<ProdutoVO> list() {

        return produto;
    }

    public List<ProdutoVO> pesquisar(String nome) {

        ArrayList<ProdutoVO> pesquisar = new ArrayList();
        for (ProdutoVO produtoVO : produto) {
            if (produtoVO.getProduto().toUpperCase().equals(nome.toUpperCase())) {
                pesquisar.add(produtoVO);
            }

        }

        return pesquisar;
    }

    public void baixaNoEstoque(List<ProdutoVO> carrinho) {

        for (ProdutoVO produtoVenda : carrinho) {
            int index = 0;
            for (ProdutoVO produtoReal : produto) {

                if (produtoReal.getId() == produtoVenda.getId()) {
                    int quantidade = (produtoReal.getQuantidade() - produtoVenda.getQuantidadeVendida());
                    produto.get(index).setQuantidade(quantidade);
                    break;

                }

                index++;
            }
        }

    }

}

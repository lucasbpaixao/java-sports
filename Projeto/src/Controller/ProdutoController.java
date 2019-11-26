/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ProdutoDao;

import Model.ProdutoModel;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ProdutoController {

    static ProdutoDao dao = new ProdutoDao();

    public static void cadastroDeProdutos(ProdutoModel produto) {
        dao.cadastroDeProdutos(produto);
    }

    public static String excluir(int id) {
        return dao.excluir(id);
    }

    public static List<ProdutoModel> list() {
        return dao.Listar();
    }

    public static List<ProdutoModel> pesquisar(String nome) {
        return dao.pesquisar(nome);
    }

    public static void baixaNoEstoque(List<ProdutoModel> carrinho) {
        dao.baixaNoEstoque(carrinho);
    }

    public List<ProdutoModel> pesquisarNomeProduto(String nome) {
        return dao.pesquisarNomeProduto(nome);

    }
  

    public void alterarProduto(ProdutoModel p, int id) {
        dao.alterarProduto(p,id);
    }
}

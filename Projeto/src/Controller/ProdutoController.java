/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ProdutoDao;

import Model.ProdutoVO;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ProdutoController {

    static ProdutoDao dao = new ProdutoDao();

    public static void cadastroDeProdutos(ProdutoVO produto) {
        dao.cadastroDeProdutos(produto);
    }

    public static String excluir(int id) {
        return dao.excluir(id);
    }

    public static List<ProdutoVO> list() {
        return dao.Listar();
    }

    public static List<ProdutoVO> pesquisar(String nome) {
        return dao.pesquisar(nome);
    }

    public static void baixaNoEstoque(List<ProdutoVO> carrinho) {
        dao.baixaNoEstoque(carrinho);
    }

    public List<ProdutoVO> pesquisarNomeProduto(String nome) {
        return dao.pesquisarNomeProduto(nome);

    }
  

    public void alterarProduto(ProdutoVO p, int id) {
        dao.alterarProduto(p,id);
    }
}

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
 * @see Model.ProdutoVO
 * @see Dao.ProdutoDao
 */
public class ProdutoController {

    static ProdutoDao dao = new ProdutoDao();
    
    /**
     * @param produto
     */

    public static void cadastroDeProdutos(ProdutoVO produto) {
        dao.cadastroDeProdutos(produto);
    }
    //Método para excluir produtos
    public static String excluir(int id) {
        return dao.excluir(id);
    }
    
    //Método para Listar produto
    public static List<ProdutoVO> list() {
        return dao.Listar();
    }
    //Método para Listar pesquisar
    public static List<ProdutoVO> pesquisar(String nome) {
        return dao.pesquisar(nome);
    }
    //Método para dar baixa no estoque
    public static void baixaNoEstoque(List<ProdutoVO> carrinho) {
        dao.baixaNoEstoque(carrinho);
    }
    
    ////Método para Listar pesquisar nome do produto
    public List<ProdutoVO> pesquisarNomeProduto(String nome) {
        return dao.pesquisarNomeProduto(nome);

    }
  
    //Método para alterar o produto
    public void alterarProduto(ProdutoVO p, int id) {
        dao.alterarProduto(p,id);
    }
}

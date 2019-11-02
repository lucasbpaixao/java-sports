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
    
    public static void cadastroDeProdutos(ProdutoVO produto){
        dao.cadastroDeProdutos(produto);
    }

    public static void excluir(int id) {
        dao.excluir(id);
    }

    public static void alterar(int id, ProdutoVO c) {
        dao.alterar(id, c);
    }

    public static List<ProdutoVO> list() {
        return dao.list();
    }

    public static List<ProdutoVO> pesquisar(String nome) {
        return dao.pesquisar(nome);
    }

    public static void baixaNoEstoque(List<ProdutoVO> carrinho) {
        dao.baixaNoEstoque(carrinho);
    }
}

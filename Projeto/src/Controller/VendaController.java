/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.VendaDao;
import Model.Venda;

/**
 *
 * @author lucas
 * @see Dao.VendaDao
 * @see Model.Venda
 */
public class VendaController {

    /**
     * Instancia do DAO de venda
     */
    private static VendaDao dao = new VendaDao();
    
    /**
     * Metodo para pegar as informações da venda e passar para o metodo do DAO
     * @param venda - Venda
     */
    public static void cadastrarVenda(Venda venda) {
        dao.cadastrarVenda(venda);
    }
    
}

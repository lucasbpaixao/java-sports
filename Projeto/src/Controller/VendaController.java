/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.VendaDao;
import Model.VendaModel;

/**
 *
 * @author lucas
 * @see Dao.VendaDao
 * @see Model.VendaModel
 */
public class VendaController {

    /**
     * Instancia do DAO de venda
     */
    private static VendaDao dao = new VendaDao();
    
    /**
     * Metodo para pegar as informações da venda e passar para o metodo do DAO
     * @param venda - VendaModel
     */
    public static void cadastrarVenda(VendaModel venda) {
        dao.cadastrarVenda(venda);
    }
    
}

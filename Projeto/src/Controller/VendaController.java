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
 */
public class VendaController {

    private static VendaDao dao = new VendaDao();
    public static void cadastrarVenda(Venda venda) {
        dao.cadastrarVenda(venda);
    }
    
}

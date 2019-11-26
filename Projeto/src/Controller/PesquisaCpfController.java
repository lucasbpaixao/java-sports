/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PesquisaCpfDAO;
import Model.PesquisaCpfVO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oz500
 */
public class PesquisaCpfController {

    public static List<PesquisaCpfVO> pesquisaCPF(String id) {
        PesquisaCpfDAO cpfDAO;
        cpfDAO = new PesquisaCpfDAO();
        try {
            return cpfDAO.pesquisaCpf(id);
        } catch (SQLException ex) {
            Logger.getLogger(PesquisaCpfController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

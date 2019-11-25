/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AnaliticoDAO;
import Dao.RelatorioDAO;
import Model.AnaliticoVO;
import Model.Relatorio;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oz500
 */
public class AnaliticoController {
    
    public static List<AnaliticoVO> listaAnalitico(String id) throws SQLException{
        AnaliticoDAO dao = null;
        try {
            dao = new AnaliticoDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.ListarAnalitico(id);
    }
    
    public static List<AnaliticoVO> contarIntensRelatorio() throws SQLException{
        AnaliticoDAO dao = null;
        try {
            dao = new AnaliticoDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.contarItens();
    }
}

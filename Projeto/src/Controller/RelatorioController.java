/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.RelatorioDAO;
import Model.Relatorio;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oz500
 */
public class RelatorioController {

    

    public static List<Relatorio> list() throws SQLException{
        RelatorioDAO dao = null;
        try {
            dao = new RelatorioDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.Listar();
    }
    
    public static List<Relatorio> listaAnalitico(String id) throws SQLException{
        RelatorioDAO dao = null;
        try {
            dao = new RelatorioDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.ListarAnalitico(id);
    }
}

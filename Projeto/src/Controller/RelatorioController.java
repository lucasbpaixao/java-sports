/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.RelatorioDAO;
import Model.RelatorioModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Leite da Silva
 * @see Model.RelatorioModel
 * @see Dao.RelatorioDAO
 */
public class RelatorioController {

    /**
     * @method Método responsável por listar informações do banco de dados.
     * Esse método retorna todos os dados obtidos no banco.
     */
    public static List<RelatorioModel> list() throws SQLException {
        /**
         * @param dao responsável por armazenar os dados obtidos do banco de
         * dados através da DAO.
         */
        RelatorioDAO dao = null;
        
        /**
         * @throw caso não econtre a lista, ou quebre alguma instrução, irá lançar
         * uma exceção, informando o tipo de erro que houve.
         */
        try {
            dao = new RelatorioDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /**
         * @return retorna uma lista contendo todas as informações do banco em 
         * um arrayList.
         */
        return dao.Listar();
    }
    
     /**
     * @deprecated Método responsável por listar dados do relatório analítico, obtendo os
     * dados do banco de dados.
    */
    public static List<RelatorioModel> listaAnalitico(String id) throws SQLException {
        RelatorioDAO dao = null;
        try {
            dao = new RelatorioDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.ListarAnalitico(id);
    }
}

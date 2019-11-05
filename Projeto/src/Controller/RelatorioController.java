/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Relatorio;
import Dao.RelatorioDAO;    

/**
 *
 * @author oz500
 */
public class RelatorioController {
    
    public static RelatorioDAO dao = new RelatorioDAO();
    
    public static void pesquisar(Relatorio pesquisa){
        dao.pesquisa(pesquisa);
    }
}

package Controller;

/*Importação de bibliotecas para funcionamento do sistema*/
import Dao.AnaliticoDAO;
import Dao.RelatorioDAO;
import Model.AnaliticoModel;
import Model.RelatorioModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Daniel Leite da Silva
 * @see Dao.AnaliticoDAO
 * @see Dao.RelatorioDAO
 * @see Model.AnaliticoVO
 * @see Model.Relatorio
 */

/**
* @method Método responsável por listar informações do banco de dados.
*/
public class AnaliticoController {
    /**
     * @param id informa o dado que deve ser buscado no banco de dados
     */
    public static List<AnaliticoModel> listaAnalitico(String id) throws SQLException {
        /**
         * @param dao responsável por armazenar os dados obtidos do banco de
         * dados através da DAO.
         */
        AnaliticoDAO dao = null;

        /**
         * @throw caso não econtre a lista, ou quebre alguma instrução, irá lançar
         * uma exceção, informando o tipo de erro que houve.
         */
        try {
            dao = new AnaliticoDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /**
         * @return retorna uma lista em um arrayList.
         */
        return dao.ListarAnalitico(id);
    }

    /**
     * @method Método responsável por listar quantidade de produtos vendidos, obtendo os
     * dados do banco de dados.
    */
    public static List<AnaliticoModel> contarIntensRelatorio() throws SQLException {
        /**
         * @param dao responsável por armazenar os dados obtidos do banco de
         * dados através da DAO.
         */
        AnaliticoDAO dao = null;
        
        /**
         * @throw caso não econtre a lista, quebre alguma instrução, irá lançar
         * uma execeção, informando o tipo de erro que houve.
         */
        try {
            dao = new AnaliticoDAO();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**
         * @return retorna uma lista contendo a quantidade vendida em um arrayList 
         */
        return dao.contarItens();
    }
}

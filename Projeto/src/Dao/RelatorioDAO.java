/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/*Importação de bibliotecas para funcionamento do sistema*/
import Model.Relatorio;
import java.util.ArrayList;
import DAOFactory.DAOFactory;
import Model.Venda;
import View.RelatorioView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Daniel Leite da Silva
 * @see Model.Relatorio
 * @see DAOFactory.DAOFactory
 * @see View.RelatorioView
 * @see Model.Venda
 */
public class RelatorioDAO {

    /**
     * @deprecated relatorio é um array list responsável por armazenar dados;
     */
    public static List<Relatorio> relatorio = new ArrayList();

    /**
     * @method RelatorioDAO construtor
     * @throws SQLException
     */
    public RelatorioDAO() throws SQLException {

    }

    /**
     * @method Listar obtém os dados do banco de dados serem listados.
     */
    public List<Relatorio> Listar() throws SQLException {

        /**
         * @param conexao inicia a conexao com banco de dados.
         */
        Connection conexao = null;

        /**
         * @param instrucaoSQL prepara o statement para executar instruções do
         * banco de dados.
         */
        PreparedStatement instrucaoSQL = null;

        /**
         * @param relatorios arrayList responsavel por armazenar os dados
         * obtidos na execucao da query.
         */
        List<Relatorio> relatorios = new ArrayList<>();

        /**
         * @throw Lança exceção caso não consiga conectar ao banco.
         */
        try {
            conexao = DAOFactory.conexao();

            /**
             * @param instrucaoSQL recebe a conexao com statement setado,
             * devolvendo os dados listados na query.
             */
            instrucaoSQL = conexao.prepareStatement("select venda.idVenda, cliente.nome, cliente.sobrenome, venda.dataVenda, sum(venda.valorTotal) as total, venda.cpfCliente, count(*) as contador\n"
                    + "from venda inner join cliente on venda.cpfCliente = cliente.cpfCliente group by venda.cpfCliente, venda.dataVenda order by venda.idVenda;");

            /**
             * @param res recebe a instrução para executar a query do banco.
             */
            ResultSet res = instrucaoSQL.executeQuery();

            /**
             * Interador para recuperar os paramentos da query.
             */
            while (res.next()) {

                /**
                 * @param rel passa a ser do tipo objeto. Nele é setado o
                 * resultado obtido na model Relatorio.
                 */
                Relatorio rel = new Relatorio(res.getInt("idVenda"), res.getString("nome"), res.getDate("dataVenda"), res.getFloat("total"), res.getLong("cpfCliente"), res.getInt("contador"), res.getString("sobrenome"));

                /**
                 * @param relatorios recebe os dados listados.
                 */
                relatorios.add(rel);

            }

            /**
             * @param instrucaoSQL executa a ação no banco de dados.
             */
            instrucaoSQL.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        /**
         * @return retorna o arrayList relatorio
         */
        return relatorios;
    }

    /**
     * @method listarAnalitico lista todos os dados para mostrar na view.
     */
    public List<Relatorio> ListarAnalitico(String id) throws SQLException {

        /**
         * @param conexao inicia a conexao com banco de dados.
         */
        Connection conexao = null;

        /**
         * @param instrucaoSQL prepara o statement para executar instruções do
         * banco de dados.
         */
        PreparedStatement instrucaoSQL = null;

        /**
         * @param relatorios arrayList responsavel por armazenar os dados
         * obtidos na execucao da query.
         */
        List<Relatorio> relatorios = new ArrayList<>();

        /**
         * @throw Lança exceção caso não consiga conectar ao banco.
         */
        try {
            conexao = DAOFactory.conexao();

            /**
             * @param instrucaoSQL recebe a conexao com statement setado,
             * devolvendo os dados listados na query.
             */
            instrucaoSQL = conexao.prepareStatement("select venda.idVenda, cliente.nome, cliente.sobrenome, venda.dataVenda, sum(venda.valorTotal) as total, venda.cpfCliente, count(*) as contador\n"
                    + "from venda inner join cliente on venda.cpfCliente = cliente.cpfCliente where venda.cpfCliente = " + id + " group by venda.cpfCliente, venda.dataVenda order by venda.idVenda;");

            /**
             * @param res recebe a instrução para executar a query do banco.
             */
            ResultSet res = instrucaoSQL.executeQuery();

            /**
             * Interador para recuperar os paramentos da query.
             */
            while (res.next()) {
                /**
                 * @param rel passa a ser do tipo objeto. Nele é setado o
                 * resultado obtido na model Relatorio.
                 */

                Relatorio rel = new Relatorio(res.getInt("idVenda"), res.getString("nome"), res.getDate("dataVenda"), res.getFloat("total"), res.getLong("cpfCliente"), res.getInt("contador"), res.getString("sobrenome"));
                
                /**
                 * @param relatorios recebe os dados listados.
                 */
                relatorios.add(rel);

            }
            
            /**
             * @param instrucaoSQL executa a ação no banco de dados.
             */
            instrucaoSQL.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        /**
         * @return retorna o arrayList relatorio
         */
        return relatorios;
    }
    
}

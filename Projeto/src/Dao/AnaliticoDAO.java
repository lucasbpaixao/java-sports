/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/*Importação de bibliotecas para funcionamento do sistema*/
import Model.RelatorioModel;
import java.util.ArrayList;
import DAOFactory.DAOFactory;
import Model.AnaliticoModel;
import Model.VendaModel;
import View.RelatorioView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Daniel Leite da Silva
 * @see Model.RelatorioModel
 * @see DAOFactory.DAOFactory
 * @see Model.AnaliticoModel
 * @see Model.VendaModel
 * @see View.RelatorioView
 */
public class AnaliticoDAO {

    /**
     * @deprecated relatorio é um array list responsável por armazenar dados;
     */
    public static List<AnaliticoModel> relatorio = new ArrayList();

    /**
     * @method AnaliticoDAO construtor
     * @throws SQLException
     */
    public AnaliticoDAO() throws SQLException {

    }

    /**
     * @param id recupera o valor setado na variável
     * @return retorna um arrayList contendo os dados do banco de dados.
     * @throws SQLException
     * @method ListarAnalitico obtém os dados a serem listados no banco de dados.
     */
    

    public List<AnaliticoModel> ListarAnalitico(String id) throws SQLException {
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
         * @param relatorios arrayList responsavel por armazenar os dados obtidos
         * na execucao da query.
         */
        List<AnaliticoModel> relatorios = new ArrayList<>();

        /**
         * @throw Lança exceção caso não consiga conectar ao banco.
         */
        try {
            conexao = DAOFactory.conexao();
            /**
             * @param instrucaoSQL recebe a conexao com statement setado,
             * devolvendo os dados listados na query.
             */
            instrucaoSQL = conexao.prepareStatement("select venda.cpfCliente, \n"
                    + "cliente.nome, \n"
                    + "cliente.sobrenome, \n"
                    + "carrinho.quantidadeVendida, \n"
                    + "produto.nomeProduto, produto.valor from venda\n"
                    + "inner join carrinho on venda.idVenda = carrinho.idVenda\n"
                    + "inner join cliente on venda.cpfCliente = cliente.cpfCliente\n"
                    + "inner join produto on carrinho.idProduto = produto.idProduto where venda.cpfCliente = " + id + ";");

            /**
             * @param res recebe a instrução para executar a query do banco.
             */
            ResultSet res = instrucaoSQL.executeQuery();

            /**
             * Interador para recuperar os paramentos da query.
             */
            while (res.next()) {

                /**
                 * @param resultado passa a ser do tipo objeto. Nele é setado o
                 * resultado obtido na model AnaliticoVO.
                 */
                AnaliticoModel resultado = new AnaliticoModel(res.getLong("cpfCliente"), res.getString("nome"), res.getString("sobrenome"), res.getInt("quantidadeVendida"), res.getString("nomeProduto"), res.getLong("valor"));

                /**
                 * @param relatorios recebe os dados listados.
                 */
                relatorios.add(resultado);

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
     * @method contarItens obtém a quantidade no banco de dados a serem listados.
     */
    public List<AnaliticoModel> contarItens() throws SQLException {
        
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
         * @param relatorios arrayList responsavel por armazenar os dados obtidos
         * na execucao da query.
         */
        List<AnaliticoModel> relatorios = new ArrayList<>();
        
        /**
         * @throw Lança exceção caso não consiga conectar ao banco.
         */
        try {
            
            conexao = DAOFactory.conexao();
            
            /**
             * @param instrucaoSQL recebe a conexao com statement setado,
             * devolvendo os dados listados na query.
             */

            instrucaoSQL = conexao.prepareStatement("select venda.cpfCliente, \n"
                    + "cliente.nome, \n"
                    + "cliente.sobrenome, \n"
                    + "carrinho.quantidadeVendida, \n"
                    + "produto.nomeProduto, produto.valor from venda\n"
                    + "inner join carrinho on venda.idVenda = carrinho.idVenda\n"
                    + "inner join cliente on venda.cpfCliente = cliente.cpfCliente\n"
                    + "inner join produto on carrinho.idProduto = produto.idProduto;");
            
             /**
             * @param res recebe a instrução para executar a query do banco.
             */
            
            ResultSet res = instrucaoSQL.executeQuery();
            
            /**
             * Interador para recuperar os paramentos da query.
             */
            
            while (res.next()) {
                
                 /**
                 * @param resultado passa a ser do tipo objeto. Nele é setado o
                 * resultado obtido na model AnaliticoVO.
                 */
                
                AnaliticoModel resultado = new AnaliticoModel(res.getLong("cpfCliente"), res.getString("nome"), res.getString("sobrenome"), res.getInt("quantidadeVendida"), res.getString("nomeProduto"), res.getLong("valor"));
                
                /**
                 * @param relatorios recebe os dados listados.
                 */
                relatorios.add(resultado);

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

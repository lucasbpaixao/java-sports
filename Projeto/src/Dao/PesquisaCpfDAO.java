/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DAOFactory.DAOFactory;
import Model.PesquisaCpfModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oz500
 */
public class PesquisaCpfDAO {
    
    public List<PesquisaCpfModel> pesquisaCpf(String id) throws SQLException {
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
        List<PesquisaCpfModel> relatorios = new ArrayList<>();

        /**
         * @throw Lança exceção caso não consiga conectar ao banco.
         */
        try {
            conexao = DAOFactory.conexao();
            /**
             * @param instrucaoSQL recebe a conexao com statement setado,
             * devolvendo os dados listados na query.
             */
            instrucaoSQL = conexao.prepareStatement("select idVenda, cpfCliente from venda where idVenda = " + id + ";");

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
                PesquisaCpfModel resultado = new PesquisaCpfModel(res.getLong("cpfCliente"));

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

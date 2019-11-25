/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Relatorio;
import java.util.ArrayList;
import DAOFactory.DAOFactory;
import Model.AnaliticoVO;
import Model.Venda;
import View.RelatorioView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author oz500
 */
public class AnaliticoDAO {

    public static List<AnaliticoVO> relatorio = new ArrayList();

    public AnaliticoDAO() throws SQLException {

    }

    public List<AnaliticoVO> ListarAnalitico(String id) throws SQLException {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<AnaliticoVO> relatorios = new ArrayList<>();

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("select venda.cpfCliente, \n"
                    + "cliente.nome, \n"
                    + "cliente.sobrenome, \n"
                    + "carrinho.quantidadeVendida, \n"
                    + "produto.nomeProduto, produto.valor from venda\n"
                    + "inner join carrinho on venda.idVenda = carrinho.idVenda\n"
                    + "inner join cliente on venda.cpfCliente = cliente.cpfCliente\n"
                    + "inner join produto on carrinho.idProduto = produto.idProduto where venda.cpfCliente = "+id+";");

            ResultSet res = instrucaoSQL.executeQuery();

            while (res.next()) {

                AnaliticoVO resultado = new AnaliticoVO(res.getLong("cpfCliente"), res.getString("nome"), res.getString("sobrenome"), res.getInt("quantidadeVendida"), res.getString("nomeProduto"), res.getLong("valor"));

                relatorios.add(resultado);

            }

            instrucaoSQL.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return relatorios;
    }
    
    public List<AnaliticoVO> contarItens() throws SQLException {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<AnaliticoVO> relatorios = new ArrayList<>();

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("select venda.cpfCliente, \n"
                    + "cliente.nome, \n"
                    + "cliente.sobrenome, \n"
                    + "carrinho.quantidadeVendida, \n"
                    + "produto.nomeProduto, produto.valor from venda\n"
                    + "inner join carrinho on venda.idVenda = carrinho.idVenda\n"
                    + "inner join cliente on venda.cpfCliente = cliente.cpfCliente\n"
                    + "inner join produto on carrinho.idProduto = produto.idProduto;");

            ResultSet res = instrucaoSQL.executeQuery();

            while (res.next()) {

                AnaliticoVO resultado = new AnaliticoVO(res.getLong("cpfCliente"), res.getString("nome"), res.getString("sobrenome"), res.getInt("quantidadeVendida"), res.getString("nomeProduto"), res.getLong("valor"));

                relatorios.add(resultado);

            }

            instrucaoSQL.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return relatorios;
    }
    

}

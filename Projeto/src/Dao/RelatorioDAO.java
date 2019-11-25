/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
 * @author oz500
 */
public class RelatorioDAO {

    public static List<Relatorio> relatorio = new ArrayList();

    public RelatorioDAO() throws SQLException {

    }

    public List<Relatorio> Listar() throws SQLException {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<Relatorio> relatorios = new ArrayList<>();

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("select venda.idVenda, cliente.nome, cliente.sobrenome, venda.dataVenda, sum(venda.valorTotal) as total, venda.cpfCliente, count(*) as contador\n" +
            "from venda inner join cliente on venda.cpfCliente = cliente.cpfCliente group by venda.cpfCliente, venda.dataVenda order by venda.idVenda;");

            ResultSet res = instrucaoSQL.executeQuery();

            while (res.next()) {

                Relatorio rel = new Relatorio(res.getInt("idVenda"), res.getString("nome"), res.getDate("dataVenda"), res.getFloat("total"), res.getLong("cpfCliente"), res.getInt("contador"), res.getString("sobrenome"));

                relatorios.add(rel);

            }
            
            instrucaoSQL.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return relatorios;
    }
   

    public List<Relatorio> ListarAnalitico(String id) throws SQLException {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<Relatorio> relatorios = new ArrayList<>();

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("select venda.idVenda, cliente.nome, cliente.sobrenome, venda.dataVenda, sum(venda.valorTotal) as total, venda.cpfCliente, count(*) as contador\n" +
            "from venda inner join cliente on venda.cpfCliente = cliente.cpfCliente where venda.cpfCliente = "+id+" group by venda.cpfCliente, venda.dataVenda order by venda.idVenda;");

            ResultSet res = instrucaoSQL.executeQuery();

            while (res.next()) {

                Relatorio rel = new Relatorio(res.getInt("idVenda"), res.getString("nome"), res.getDate("dataVenda"), res.getFloat("total"), res.getLong("cpfCliente"), res.getInt("contador"), res.getString("sobrenome"));

                relatorios.add(rel);

            }
            
            instrucaoSQL.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return relatorios;
    } 
   
}

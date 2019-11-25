/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DAOFactory.DAOFactory;
import Model.ProdutoVO;
import Model.Venda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class VendaDao {

    public void cadastrarVenda(Venda venda) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            instrucaoSQL = conexao.prepareStatement("INSERT INTO venda (cpfCliente, dataVenda, valorTotal) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            instrucaoSQL.setLong(1, venda.getCliente().getCpf());
            instrucaoSQL.setDate(2, new java.sql.Date(venda.getData().getTime()));
            instrucaoSQL.setDouble(3, venda.getValorTotal());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            int id = 0;
            if (linhasAfetadas > 0) {

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                } 
            }
            for (ProdutoVO p : venda.getCarrinho()) {
                instrucaoSQL = conexao.prepareStatement("INSERT INTO carrinho (idVenda, idProduto, quantidadeVendida) values (?,?,?)");

                instrucaoSQL.setInt(1, id);
                instrucaoSQL.setInt(2, p.getId());
                instrucaoSQL.setDouble(3, p.getQuantidadeVendida());

                instrucaoSQL.execute();
            }
            
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

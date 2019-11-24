/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Controller.CadastroClienteController;
import DAOFactory.DAOFactory;
import Model.CadastroClienteModel;
import View.CadastroClienteView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raul.stbarreto
 */
public class CadastroClienteDAO {

    static List<CadastroClienteModel> clientes = new ArrayList();

    /* public static String Cadastro(CadastroClienteModel a){
        clientes.add(a);
        return "Cadastrado com sucesso";
    }
     */
    public static String Cadastro(CadastroClienteModel a) throws ParseException, SQLException {
        if(CadastroClienteView.CPFigual(a.getCpf())){
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente(cpfCliente,nome,sobrenome,dataNascimento,sexo,rg,telefone,estado_civil,uf,cidade,rua,numero,CEP) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");

            java.util.Date dataUtil = new java.util.Date();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

            instrucaoSQL.setLong(1, a.getCpf());
            instrucaoSQL.setString(2, a.getNome());
            instrucaoSQL.setString(3, a.getSobrenome());
            instrucaoSQL.setDate(4, new java.sql.Date(fmt.parse(a.getData()).getTime()));
            instrucaoSQL.setString(5, a.getSexo());
            instrucaoSQL.setString(6, a.getRg());
            instrucaoSQL.setString(7, a.getTelefone());
            instrucaoSQL.setString(8, a.getEstado());
            instrucaoSQL.setString(9, a.getUf());
            instrucaoSQL.setString(10, a.getCidade());
            instrucaoSQL.setString(11, a.getRua());
            instrucaoSQL.setInt(12, a.getNumero());
            instrucaoSQL.setInt(13, a.getCep());

            instrucaoSQL.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "Cadastrado com sucesso";
        }else {
            return "CPF já cadastrado, utilize outro! Cliente não cadastrado";
        }
       
    }

    public static String Excluir(long cpf) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE cpfCliente = ?");

            instrucaoSQL.setLong(1, cpf);
            
            instrucaoSQL.execute();
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "Excluido com sucesso";
    }

    public static String alterar(CadastroClienteModel a, int linha) throws ParseException, SQLException {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("UPDATE cliente\n" +
            "SET nome = ?,sobrenome = ?,dataNascimento = ?,sexo = ?,\n" +
            "rg = ?,telefone = ?,estado_civil = ?,uf = ?,cidade = ?,\n" +
            "rua = ?,numero = ?,CEP = ?\n" +
            "WHERE cpfCliente = ?;");

            java.util.Date dataUtil = new java.util.Date();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

            
            instrucaoSQL.setString(1, a.getNome());
            instrucaoSQL.setString(2, a.getSobrenome());
            instrucaoSQL.setDate(3, new java.sql.Date(fmt.parse(a.getData()).getTime()));
            instrucaoSQL.setString(4, a.getSexo());
            instrucaoSQL.setString(5, a.getRg());
            instrucaoSQL.setString(6, a.getTelefone());
            instrucaoSQL.setString(7, a.getEstado());
            instrucaoSQL.setString(8, a.getUf());
            instrucaoSQL.setString(9, a.getCidade());
            instrucaoSQL.setString(10, a.getRua());
            instrucaoSQL.setInt(11, a.getNumero());
            instrucaoSQL.setInt(12, a.getCep());
            instrucaoSQL.setLong(13, a.getCpf());

            instrucaoSQL.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "Alterado com sucesso";
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Controller.CadastroClienteController;
import DAOFactory.DAOFactory;
import Model.CadastroClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

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
    public static String Cadastro(CadastroClienteModel a){
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
        conexao = DAOFactory.conexao();
        
        instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente(cpfCliente,nome,sobrenome,dataNascimento,sexo,rg,telefone) VALUES (?,?,?,?,?,?,?)");
        
        
        
        instrucaoSQL.setLong(1,a.getCpf());
        instrucaoSQL.setString(2,a.getNome());
        instrucaoSQL.setString(3, a.getSobrenome());
        instrucaoSQL.setDate(4,java.sql.Date.valueOf(df.format(a.getData())));
        instrucaoSQL.setString(5,a.getSexo());
        instrucaoSQL.setString(6,a.getRg());
        instrucaoSQL.setString(7,a.getTelefone());
        
        instrucaoSQL.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return "Cadastrado com sucesso";
    }
    
    public static String Excluir(int linha){
        clientes.remove(linha);
        return "Excluido com sucesso";
    }
    
    public static String alterar(CadastroClienteModel a,int linha){
        clientes.remove(linha);
        clientes.add(linha, a);
        return "Alterado com sucesso";
    }
    
    public static List<CadastroClienteModel> listar(){
        return clientes;
    }

}

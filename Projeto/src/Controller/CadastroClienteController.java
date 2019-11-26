/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.CadastroClienteDAO;
import Model.CadastroClienteModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author raul.stbarreto
 * @see Dao.CadastroClienteDAO
 * @see Model.CadastroClienteModel
 */
public class CadastroClienteController {
    
    /**
     * Metodo para chamar o contrutor do model e enviar os dados para o DAO
     * @param nome - String
     * @param  sobrenome - String
     * @param  data - String
     * @param  sexo - String
     * @param  cpf - long
     * @param rg - String
     * @param telefone - String
     * @param estado - String
     * @param uf - String
     * @param cidade - String
     * @param rua - String
     * @param numero - int
     * @param cep - int
     * @throws ParseException
     * @throws SQLException
     * @return String 
     */
    public static String Salvar(String nome,String sobrenome,String data,
            String sexo,long cpf,String rg,String telefone,String estado,String uf,
            String cidade,String rua,int numero,int cep) throws ParseException, SQLException{
        
        CadastroClienteModel s = new CadastroClienteModel(nome, sobrenome, data,sexo,cpf, rg, telefone,estado,uf,
            cidade,rua,numero,cep);
        
        return CadastroClienteDAO.Cadastro(s);
    }
    
    
    /**
     * Metodo para enviar os dados para o DAO
     * @param cpf - long
     * @return String
     */
    public static String excluir(long cpf){
        return CadastroClienteDAO.Excluir(cpf);
    }
    
    /**
     * Metodo para chamar o contrutor do model e enviar os dados para o DAO
     * @param nome - String
     * @param  sobrenome - String
     * @param  data - String
     * @param  sexo - String
     * @param  cpf - long
     * @param rg - String
     * @param telefone - String
     * @param estado - String
     * @param uf - String
     * @param cidade - String
     * @param rua - String
     * @param numero - int
     * @param cep - int
     * @param linha - int
     * @throws ParseException
     * @throws SQLException
     * @return String 
     */
    public static String alterar(String nome,String sobrenome,String data,
            String sexo,long cpf,String rg,String telefone,String estado,String uf,
            String cidade,String rua,int numero,int cep,int linha) throws ParseException, SQLException{
        
        CadastroClienteModel s = new CadastroClienteModel(nome, sobrenome, data,sexo,cpf, rg, telefone,estado,uf,
            cidade,rua,numero,cep);
        
        return CadastroClienteDAO.alterar(s,linha);
    }
    
    /**
     * Metodo para chamar o metodo do DAO
     * @return chamada no DAO
     */
    public static List<CadastroClienteModel> listar(){
        
        return CadastroClienteDAO.listar();
    }
    
}


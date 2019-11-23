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
 */
public class CadastroClienteController {
    
    public static String Salvar(String nome,String sobrenome,String data,
            String sexo,long cpf,String rg,String telefone,String estado,String uf,
            String cidade,String rua,int numero,int cep) throws ParseException, SQLException{
        
        CadastroClienteModel s = new CadastroClienteModel(nome, sobrenome, data,sexo,cpf, rg, telefone,estado,uf,
            cidade,rua,numero,cep);
        
        return CadastroClienteDAO.Cadastro(s);
    }
    
    
    
    public static String excluir(long cpf){
        return CadastroClienteDAO.Excluir(cpf);
    }
    
    public static String alterar(String nome,String sobrenome,String data,
            String sexo,long cpf,String rg,String telefone,String estado,String uf,
            String cidade,String rua,int numero,int cep,int linha) throws ParseException, SQLException{
        
        CadastroClienteModel s = new CadastroClienteModel(nome, sobrenome, data,sexo,cpf, rg, telefone,estado,uf,
            cidade,rua,numero,cep);
        
        return CadastroClienteDAO.alterar(s,linha);
    }
    
}


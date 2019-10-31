/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.CadastroClienteDAO;
import Model.CadastroClienteModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul.stbarreto
 */
public class CadastroClienteController {
    
    public static String Salvar(String nome,String sobrenome,String data,String sexo,String cpf,String rg,String telefone){
        
        CadastroClienteModel s = new CadastroClienteModel(nome, sobrenome, data,sexo,cpf, rg, telefone);
        
        return CadastroClienteDAO.Cadastro(s);
    }
    
    public static List<CadastroClienteModel> listar(){
        return CadastroClienteDAO.listar();
    }
    
    public static String excluir(int linha){
        return CadastroClienteDAO.Excluir(linha);
    }
    
    public static String alterar(String nome,String sobrenome,String data,String sexo,String cpf,String rg,String telefone){
        return "";
    }
    
}

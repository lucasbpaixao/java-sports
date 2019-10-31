/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Controller.CadastroClienteController;
import Model.CadastroClienteModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author raul.stbarreto
 */
public class CadastroClienteDAO {
    
    static List<CadastroClienteModel> clientes = new ArrayList();
    
    public static String Cadastro(CadastroClienteModel a){
        clientes.add(a);
        return "Cadastrado com sucesso";
    }
    
    public static String Excluir(int linha){
        clientes.remove(linha);
        return "Excluido com sucesso";
    }
    
    public static void alterar(CadastroClienteModel a){
        //clientes.get(a);
    }
    
    public static List<CadastroClienteModel> listar(){
        return clientes;
    }

}

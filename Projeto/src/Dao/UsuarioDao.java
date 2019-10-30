/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas.sbpaixao
 */
public class UsuarioDao {

    private static List<Usuario> usuarios = new ArrayList<>();
    public String cadatrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        
        return "Usuario Cadastrado com Sucesso";
    }

    public static boolean logar(Usuario usuario) {
        boolean logou = false;
        
        for (Usuario usuario1 : usuarios) {
            if(usuario.getLogin().equals(usuario1.getLogin()) && usuario.getSenha().equals(usuario1.getSenha())){
                logou = true;
            }
        }
        
        return logou;
    }
    
}

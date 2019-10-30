/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.UsuarioDao;
import Model.Usuario;

/**
 *
 * @author lucas.sbpaixao
 */
public class UsuarioController {
    
    private static UsuarioDao dao = new UsuarioDao();
    public static String cadastrarUsuario(Usuario usuario) {
        return dao.cadatrarUsuario(usuario);
    }

    public static boolean logar(Usuario usuario) {
        return dao.logar(usuario); 
    }
    
}

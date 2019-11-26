/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.UsuarioDAO;
import Model.UsuarioModel;

 /**
    @author – Ederson Souza
    @see – UsuarioDAO
    @param – UsuarioModel
    @return – void
    @throws – Exception*/

/*@link Dao.UsuarioDAO#cadastrarUsuario*/

public class UsuarioController {

    public void cadastrarUsuario(UsuarioModel usuario) throws Exception {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(usuario);
    }
    
}

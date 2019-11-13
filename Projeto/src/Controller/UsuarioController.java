/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.UsuarioDAO;
import Model.UsuarioVO;

/**
 *
 * @author ederson.sfreitas
 */
public class UsuarioController {

    public void cadastrarUsuario(UsuarioVO usuario) throws Exception {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(usuario);
    }
    
}

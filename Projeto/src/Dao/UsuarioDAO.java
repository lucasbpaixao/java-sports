/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DAOFactory.DAOFactory;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ederson.sfreitas
 */
public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() throws Exception {
        this.connection = DAOFactory.conexao();
    }
/**
    @author – Ederson Souza
    @see – UsuarioVO
    @param – esquecerSenha
    @return – void
    @throws – SQLException*/
    public void cadastrarUsuario(UsuarioModel usuario) throws SQLException {

        PreparedStatement preparedStatement = this.connection.prepareStatement("Insert into usuario (nomeUsuario,login,senha,email) values (?,?,MD5(?),?)");

        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getLogin());
        preparedStatement.setString(3, usuario.getSenha());
        preparedStatement.setString(4, usuario.getEmail());

        if(preparedStatement.executeUpdate()==1){
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
        }
        
        

    }

}

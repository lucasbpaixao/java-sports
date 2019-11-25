/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DAOFactory.DAOFactory;
import Model.LoginVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ederson.sfreitas
 */
public class LoginDAO {

    private Connection connection;

    public LoginDAO() throws Exception {
        this.connection = DAOFactory.conexao();
    }

    public boolean logar(LoginVO loginVO) throws SQLException {
        boolean retorno = false;
        PreparedStatement preparedStatement = this.connection.prepareStatement("Select * from usuario where login = ? and senha = MD5(?)");

        preparedStatement.setString(1, loginVO.getLogin());
        preparedStatement.setString(2, loginVO.getSenha());

        ResultSet result = preparedStatement.executeQuery();

        if (result.next()) {
            retorno = true;
        } else {
            JOptionPane.showMessageDialog(null, "Favor verificar as credenciais", "Inválido", JOptionPane.WARNING_MESSAGE);
        }

        return retorno;

    }

}

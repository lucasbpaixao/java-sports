/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ederson.sfreitas
 */
public class DAOFactory {

    public static Connection conexao() throws SQLException {

        String url = "jdbc:mysql://localhost:3307/artigosEsportivos";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }

}

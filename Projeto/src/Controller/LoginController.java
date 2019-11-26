/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.LoginDAO;
import Model.LoginModel;
import java.sql.SQLException;

 /**
    @author – Ederson Souza
    @see – LoginModel
    @param – esquecerSenha
    @return – void
    @throws – Exception*/

/*@link Dao.LoginDAO#logar*/
public class LoginController {

    public boolean logar(LoginModel loginVO) throws Exception {
      LoginDAO loginDAO = new LoginDAO();
      return loginDAO.logar(loginVO);
    }
    
    
    
}

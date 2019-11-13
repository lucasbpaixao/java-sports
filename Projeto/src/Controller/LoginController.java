/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.LoginDAO;
import Model.LoginVO;
import java.sql.SQLException;

/**
 *
 * @author ederson.sfreitas
 */
public class LoginController {

    public boolean logar(LoginVO loginVO) throws Exception {
      LoginDAO loginDAO = new LoginDAO();
      return loginDAO.logar(loginVO);
    }
    
    
    
}

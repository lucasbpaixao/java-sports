/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author esouzaf
 */
public class ValidationLogin {

    public boolean validarCampos(JTextField txtLogin, JPasswordField txtSenha) {
        if (txtLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o login", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if (txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar a senha", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

  /**
    @author – Ederson Souza
    @see – n/a
    @param – JTextField txtEmail, JTextField txtLogin
    @return – boolean - true: sucesso , false: falha
    @throws – N/A*/
public class ValidationEsquecerSenha {

    public boolean validarCampos(JTextField txtEmail, JTextField txtLogin) {
        if (txtLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o login", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o email", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;

        }
        return true;

    }

}

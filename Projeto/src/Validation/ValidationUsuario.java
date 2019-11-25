/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author esouzaf
 */
public class ValidationUsuario {

    public boolean validarCampos(JTextField txtlogin, JTextField txtnome, JTextField txtemail, JPasswordField txtsenha) {

        if (txtlogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o login", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (txtnome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o nome", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (txtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o email", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (txtsenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar a senha", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;

    }

    public boolean validarEmailUsuario(String email) {
        boolean emailValidado = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        java.util.regex.Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            emailValidado = true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato inválido para email", "Inválido", JOptionPane.WARNING_MESSAGE);
        }

        return emailValidado;

    }
    
    
}

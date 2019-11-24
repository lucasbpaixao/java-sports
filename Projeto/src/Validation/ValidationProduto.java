/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author esouzaf
 */
public class ValidationProduto {

    public boolean validarCampos(JTextField TFproduto, JTextField TFpreco, JSpinner TFquantidade) {
        if (TFproduto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar nome do produto", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (TFpreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor informar o preço do produto", "Inválido", JOptionPane.WARNING_MESSAGE);
            return false;

        }
        return true;

    }
}
   

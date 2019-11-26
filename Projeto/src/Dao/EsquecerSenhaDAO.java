package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import Email.JavaMailApp;
import Model.EsquecerSenhaModel;

public class EsquecerSenhaDAO {

 private Connection connection;

	public EsquecerSenhaDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}
         /**
    @author – Ederson Souza
    @see – EsquecerSenhaVO
    @param – esquecerSenha
    @return – void
    @throws – Exception*/
	public void criarSenha(EsquecerSenhaModel esquecerSenha) throws Exception {
		Random gerador = new Random();

		gerador.nextInt(9);
		int senha = gerador.nextInt(999999999);
		
		
		PreparedStatement preparedStatement = this.connection
				.prepareStatement("update Usuario set senha = MD5(?) where login = ? and email = ?");
		preparedStatement.setString(1, String.valueOf(senha));
		preparedStatement.setString(2, esquecerSenha.getLogin());
		preparedStatement.setString(3, esquecerSenha.getEmail());


		if(preparedStatement.executeUpdate() == 1) {
			
			JavaMailApp email = new JavaMailApp();
			
			email.enviarEmail(esquecerSenha.getLogin(), senha, esquecerSenha.getEmail());
			JOptionPane.showMessageDialog(null, "Email enviado com sucesso");
			
		}else {
			JOptionPane.showMessageDialog(null, "Verifique se as informações estão corretas ou se o usuario realmente existe");
		}
		
		
		


	}
}

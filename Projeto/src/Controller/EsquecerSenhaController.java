package Controller;


import DAO.EsquecerSenhaDAO;
import Model.EsquecerSenhaVO;

public class EsquecerSenhaController {

	public void criarSenha(EsquecerSenhaVO esquecerSenha) throws Exception {
	EsquecerSenhaDAO esquecerSenhaDAO = new EsquecerSenhaDAO();
	esquecerSenhaDAO.criarSenha(esquecerSenha);
		
	}
	

}

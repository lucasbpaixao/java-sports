package Controller;


import DAO.EsquecerSenhaDAO;
import Model.EsquecerSenhaModel;

 /**
    @author – Ederson Souza
    @see – EsquecerSenhaModel - EsquecerSenhaDAO
    @param – esquecerSenha
    @return – void
    @throws – Exception*/

/*@link Dao.EsquecerSenhaDAO#criarSenha*/

public class EsquecerSenhaController {

	public void criarSenha(EsquecerSenhaModel esquecerSenha) throws Exception {
	EsquecerSenhaDAO esquecerSenhaDAO = new EsquecerSenhaDAO();
	esquecerSenhaDAO.criarSenha(esquecerSenha);
		
	}
	

}

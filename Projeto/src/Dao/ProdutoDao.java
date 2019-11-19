package Dao;

import Model.ProdutoVO;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import Controller.CadastroClienteController;
import DAOFactory.DAOFactory;
import Model.CadastroClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDao {

    public List<String> Listar() {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try{
            conexao = DAOFactory.conexao();
            
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto ");
            
            ResultSet resultado = instrucaoSQL.executeQuery();
            
            List<ProdutoVO> produtos = new ArrayList<>();    
            
             while (resultado.next()){
             
                ProdutoVO produtus = new ProdutoVO(resultado.getString(""), 0, 0, 0)
                 
             }
             
             
             
             
            
        } catch (SQLException a) {
            a.printStackTrace();
        }
       
    

        
    }

    static ArrayList<ProdutoVO> produto = new ArrayList();

    public String cadastroDeProdutos(ProdutoVO contato) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (idProduto,nomeProduto,valor,quantidade) VALUES (?,?,?,?)");

            instrucaoSQL.setString(2, contato.getProduto());
            instrucaoSQL.setLong(3, (long) contato.getPreco());
            instrucaoSQL.setLong(4, contato.getQuantidade());
            instrucaoSQL.setInt(1, contato.getId());

            instrucaoSQL.execute();

        } catch (SQLException a) {
            a.printStackTrace();
        }
        return "Cadastrado com sucesso";
    }

//public String numeroDeCadastros() {
    //return produto.size() + "";
    //}
    public void excluir(ProdutoVO excluir) {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            String SQL = "DELETE FROM produto (idProduto,nomeProduto,valor,quantidade) WHERE (?,?,?,?) ";

            PreparedStatement Excluir = conexao.prepareCall(SQL);

            Excluir.setString(2, excluir.getProduto());
            Excluir.setLong(3, (long) excluir.getPreco());
            Excluir.setLong(4, excluir.getQuantidade());
            Excluir.setInt(1, excluir.getId());

            Excluir.execute();

        } catch (SQLException a) {
            a.printStackTrace();
        }
        ;

    }

    public void alterar(int tirar, ProdutoVO telinha) {

        produto.get(tirar).setPreco(telinha.getPreco());
        produto.get(tirar).setProduto(telinha.getProduto());
        produto.get(tirar).setQuantidade(telinha.getQuantidade());

    }

    public List<ProdutoVO> list() {

        return produto;
    }

    public List<ProdutoVO> pesquisar(String nome) {

        ArrayList<ProdutoVO> pesquisar = new ArrayList();
        for (ProdutoVO produtoVO : produto) {
            if (produtoVO.getProduto().toUpperCase().equals(nome.toUpperCase())) {
                pesquisar.add(produtoVO);
            }

        }

        return pesquisar;
    }

    public void baixaNoEstoque(List<ProdutoVO> carrinho) {

        for (ProdutoVO produtoVenda : carrinho) {
            int index = 0;
            for (ProdutoVO produtoReal : produto) {

                if (produtoReal.getId() == produtoVenda.getId()) {
                    int quantidade = (produtoReal.getQuantidade() - produtoVenda.getQuantidadeVendida());
                    produto.get(index).setQuantidade(quantidade);
                    break;

                }

                index++;
            }
        }

    }

}

//contato.setId(produto.size() + 1);
//produto.add(contato);


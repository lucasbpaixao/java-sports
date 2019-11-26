package Dao;

import Model.ProdutoModel;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDao {

    public List<ProdutoModel> Listar() {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<ProdutoModel> produtos = new ArrayList<>();
        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto ");

            ResultSet resultado = instrucaoSQL.executeQuery();

            while (resultado.next()) {

                ProdutoModel produtus = new ProdutoModel(resultado.getString("nomeProduto"), resultado.getDouble("valor"), resultado.getInt("quantidade"), 0, resultado.getInt("idProduto"));

                produtos.add(produtus);

            }

        } catch (SQLException a) {
            a.printStackTrace();

        }

        return produtos;
    }

    static ArrayList<ProdutoModel> produto = new ArrayList();

    public String cadastroDeProdutos(ProdutoModel contato) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (nomeProduto,valor,quantidade) VALUES (?,?,?)");

            instrucaoSQL.setString(1, contato.getProduto());
            instrucaoSQL.setLong(2, (long) contato.getPreco());
            instrucaoSQL.setLong(3, contato.getQuantidade());

            instrucaoSQL.execute();

        } catch (SQLException a) {
            a.printStackTrace();
        }
        return "Cadastrado com sucesso";
    }

//public String numeroDeCadastros() {
    //return produto.size() + "";
    //}
    public static String excluir(int id) {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
        String retorno = "";
        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("DELETE FROM produto WHERE idProduto = ?");

            instrucaoSQL.setInt(1, id);

            instrucaoSQL.execute();

            retorno = "Produto Excluido com sucesso";
        } catch (SQLException a) {
            a.printStackTrace();
            return "Produto Não Pode ser Excluido, Possiveis Causas seriam Algum preenchimento Errado ou ele Estar Atribuido a uma Venda.";
        }

        return retorno;
    }

    public List<ProdutoModel> list() {

        return produto;
    }

    public List<ProdutoModel> pesquisar(String nome) {

        ArrayList<ProdutoModel> pesquisar = new ArrayList();
        for (ProdutoModel produtoVO : produto) {
            if (produtoVO.getProduto().toUpperCase().equals(nome.toUpperCase())) {
                pesquisar.add(produtoVO);
            }

        }

        return pesquisar;
    }

    public void baixaNoEstoque(List<ProdutoModel> carrinho) {

        for (ProdutoModel produtoVenda : carrinho) {
            int index = 0;
            for (ProdutoModel produtoReal : produto) {

                if (produtoReal.getId() == produtoVenda.getId()) {
                    int quantidade = (produtoReal.getQuantidade() - produtoVenda.getQuantidadeVendida());
                    produto.get(index).setQuantidade(quantidade);
                    break;

                }

                index++;
            }
        }

    }

    public List<ProdutoModel> pesquisarNomeProduto(String nome) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<ProdutoModel> produtos = new ArrayList<>();
        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("Select * from produto where nomeProduto like '%" + nome + "%'");

            ResultSet resultado = instrucaoSQL.executeQuery();

            while (resultado.next()) {

                ProdutoModel produtus = new ProdutoModel(resultado.getString("nomeProduto"), resultado.getDouble("valor"), resultado.getInt("quantidade"), 0, resultado.getInt("idProduto"));

                produtos.add(produtus);

            }

        } catch (SQLException a) {
            a.printStackTrace();

        }

        return produtos;
    }

    public void alterarProduto(ProdutoModel p,int id) {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET nomeProduto = ? , valor = ? , quantidade = ? WHERE idProduto = ?");

            instrucaoSQL.setString(1, p.getProduto());
            instrucaoSQL.setLong(2, (long) p.getPreco());
            instrucaoSQL.setLong(3, p.getQuantidade());
            instrucaoSQL.setInt(4, id);

           instrucaoSQL.execute();
           
           JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso");
          
        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o Produto");
            a.printStackTrace();
            
        }
          
    }

    
}

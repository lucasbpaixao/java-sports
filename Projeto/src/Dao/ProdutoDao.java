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

    public List<ProdutoVO> Listar() {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        List<ProdutoVO> produtos = new ArrayList<>();
        try {
            conexao = DAOFactory.conexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto ");

            ResultSet resultado = instrucaoSQL.executeQuery();

            while (resultado.next()) {

                ProdutoVO produtus = new ProdutoVO(resultado.getString("nomeProduto"), resultado.getDouble("valor"), resultado.getInt("quantidade"), 0, resultado.getInt("idProduto"));

                produtos.add(produtus);

            }

        } catch (SQLException a) {
            a.printStackTrace();

        }

        return produtos;
    }

    static ArrayList<ProdutoVO> produto = new ArrayList();

    public String cadastroDeProdutos(ProdutoVO contato) {
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
    public void excluir(int id) {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = DAOFactory.conexao();

            String SQL = "DELETE FROM produto WHERE idProduto = ?";

            PreparedStatement excluir = conexao.prepareCall(SQL);

            excluir.setInt(1, id);

            excluir.execute();

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


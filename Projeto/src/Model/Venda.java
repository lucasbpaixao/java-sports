/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Venda {
    
    /**
     * Variaveis
     */
    private int id;
    private List<ProdutoVO> carrinho;
    private CadastroClienteModel cliente;

    /**
     * Getter
     * @return CadastroClienteModel
     */
    public CadastroClienteModel getCliente() {
        return cliente;
    }

    /**
     * Setter
     * @param cliente - CadastroClienteModel
     */
    public void setCliente(CadastroClienteModel cliente) {
        this.cliente = cliente;
    }
    
    /**
     * Variaveis
     */
    private Date data;
    private double valorTotal;

    /**
     * Getter
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     * @param id - int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     * @return List
     */
    public List<ProdutoVO> getCarrinho() {
        return carrinho;
    }

    /**
     * Setter
     * @param carrinho - List
     */
    public void setCarrinho(List<ProdutoVO> carrinho) {
        this.carrinho = carrinho;
    }

    /**
     * Getter
     * @return Date
     */
    public Date getData() {
        return data;
    }

    /**
     * Setter
     * @param data - Date
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Getter
     * @return double
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Setter
     * @param valorTotal - double
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}

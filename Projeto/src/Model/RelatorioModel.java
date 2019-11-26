/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 * @author Daniel Leite da Silva
 */
public class RelatorioModel {
    
    /**
     * @params seta valores obtidos através do construtor.
     */
    
    private int idVenda;
    private String nome;
    private Date data;
    private float valorTotal;
    private int totalItens;
    private long cpf;
    private String sobrenome;

    /**
     * @method metodo construtor para armazenar variávies
     */
    public RelatorioModel(int id, String nome, Date data, float valor, long cpf, int totalItens, String sobrenome) {

         /**
         * @params Armazena dados por referência na classe
         */
        
        this.idVenda = id;
        this.nome = nome;
        this.data = data;
        this.valorTotal = valor;
        this.cpf = cpf;
        this.totalItens = totalItens;
        this.sobrenome = sobrenome;

    }
    
    /**
     * @methods get and set para setar e retornar dados obtidos do construtor.
     */
    
    public void setIdVenda(int venda) {
        idVenda = venda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setValorTotal(float valor) {
        this.valorTotal = valor;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setTotalItens(int valor) {
        this.totalItens = valor;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }
}

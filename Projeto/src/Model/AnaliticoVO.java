/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Daniel Leite da Silva
 */
public class AnaliticoVO {

    private long cpf;
    private String nome;
    private String sobrenome;
    private int quantidade;
    private String produto;
    private float valor; 

    public AnaliticoVO(long cpf, String nome, String sobrenome, int quantidade, String produto, float valor) {

        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.quantidade = quantidade;
        this.produto = produto;
        this.valor = valor;

    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public long getCpf(){
        return cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }
    public String getProduto(){
        return produto;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public float getValor(){
        return valor;
    }
    
}

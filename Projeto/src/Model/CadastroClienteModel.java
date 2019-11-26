/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author raul.stbarreto
 */
public class CadastroClienteModel {

    private String nome, sobrenome,data, sexo, rg, telefone,estado,uf,cidade,rua;
    private long cpf;
    private int numero,cep;
    
    /**
     * Metodo contrutor
     * @param nome - String
     * @param  sobrenome - String
     * @param  data - String
     * @param  sexo - String
     * @param  cpf - long
     * @param rg - String
     * @param telefone - String
     * @param estado - String
     * @param uf - String
     * @param cidade - String
     * @param rua - String
     * @param numero - int
     * @param cep - int
     */
    public CadastroClienteModel(String nome,String sobrenome,String data,String sexo,long cpf,String rg,String telefone,
            String estado,String uf,String cidade,String rua,int numero,int cep){
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data = data;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.estado = estado;
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    /**
     * Getter
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Getter
     * @return String
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Getter
     * @return String
     */
    public String getData() {
        return data;
    }

    /**
     * Getter
     * @return String
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Getter
     * @return String
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * Getter
     * @return String
     */
    public String getRg() {
        return rg;
    }

    /**
     * Getter
     * @return String
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Setter
     * @param nome - String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Setter
     * @param sobrenome - String
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Setter
     * @param data - String
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Setter
     * @param sexo - String
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Setter
     * @param cpf - long
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * Setter
     * @param rg - String
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Setter
     * @param telefone - String
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Getter
     * @return  String
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Getter
     * @return  String
     */
    public String getUf() {
        return uf;
    }

    /**
     * Getter
     * @return  String
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Getter
     * @return  String
     */
    public String getRua() {
        return rua;
    }

    /**
     * Getter
     * @return  int
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Getter
     * @return  int
     */
    public int getCep() {
        return cep;
    }

    /**
     * Setter
     * @param estado - String
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Setter
     * @param uf - String
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Setter
     * @param cidade - String
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Setter
     * @param rua - String
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * Setter
     * @param numero - int
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Setter
     * @param cep - int
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    
}

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

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getData() {
        return data;
    }

    public String getSexo() {
        return sexo;
    }

    public long getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public int getCep() {
        return cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    
}

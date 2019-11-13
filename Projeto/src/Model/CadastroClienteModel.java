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

    private String nome, sobrenome, sexo, rg, telefone;
    private long cpf;
    private Date data;
    
    public CadastroClienteModel(String nome,String sobrenome,Date data,String sexo,long cpf,String rg,String telefone){
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data = data;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Date getData() {
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

    public void setData(Date data) {
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

  
}

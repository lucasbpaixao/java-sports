/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author raul.stbarreto
 */
public class CadastroClienteModel {

    private String nome, sobrenome, data, sexo,cpf, rg, telefone;
    
    public CadastroClienteModel(String nome,String sobrenome,String data,String sexo,String cpf,String rg,String telefone){
        
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

    public String getData() {
        return data;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author oz500
 */
public class PesquisaCpfModel {
    private long cpf;
    
    public PesquisaCpfModel(long cpf){
        this.cpf = cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public long getCpf(){
        return cpf;
    }
}

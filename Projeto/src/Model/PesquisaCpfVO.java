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
public class PesquisaCpfVO {
    private long cpf;
    
    public PesquisaCpfVO(long cpf){
        this.cpf = cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public long getCpf(){
        return cpf;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class VendaDao {

    List<Venda> vendas = new ArrayList<>();
    
    public void cadastrarVenda(Venda venda) {
        venda.setId(vendas.size() + 1);
        vendas.add(venda);
        
        System.out.println("Id: " + venda.getId());
        System.out.println("Data: " + venda.getData());
        System.out.println("Valor: " + venda.getValorTotal());
        System.out.println("Cpf Cliente: " + venda.getCliente().getCpf());
        System.out.println("Nome Cliente: " + venda.getCliente().getNome());
        
    }
    
}

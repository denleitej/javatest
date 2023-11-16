
package com.mycompany.aula;

import java.util.*;

public class Comercio extends Juridica{
    
    private String ramoOperacao;
    private List<Venda> vendas;

    public Comercio(String u, String nomeFantasia, String cnpj, String ramoOperacao){
        super(u, nomeFantasia, cnpj);
        this.ramoOperacao = ramoOperacao;
        vendas = new ArrayList<>();
    }

    
    
    @Override
    public void imprimir(){
        System.out.println("\nNOME: " + this.nomeFantasia);
        System.out.println("\nRamo de Operações: " + this.ramoOperacao);
        System.out.println("\nCNPJ: " + this.cnpj);
    }

    public void vender(int id, double valor){
        Venda v = new Venda(id, valor);
        v.setComercio(this);
        vendas.add(v);
    }
    
}

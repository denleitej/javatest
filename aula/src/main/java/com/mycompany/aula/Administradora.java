
package com.mycompany.aula;

import java.util.*;

public class Administradora extends Juridica implements InstituicaoFinanceira{
    private double taxaCorretagem;
    private boolean plataformaOnline;
    private List<Investimento> investimentos;

    public Administradora(String u, String nomeFantasia, String cnpj, double taxaCorretagem, boolean plataformaOnline){
        super(u, nomeFantasia, cnpj);
        this.taxaCorretagem = taxaCorretagem;
        this.plataformaOnline = plataformaOnline;
        investimentos = new ArrayList<>();
    }


    
    @Override
    public void imprimir(){
        System.out.println("\nNOME: " + this.nomeFantasia);
        System.out.println("\nCNPJ: " + this.cnpj);
        System.out.println("\nTaxa de Corretagem: " + this.taxaCorretagem);
        System.out.println("\nA Plataforma está online? " + this.plataformaOnline);
    }
    
    public void investir(int id, double valor){
        Investimento iv = new Investimento(id, valor);
        iv.setAdm(this);
        investimentos.add(iv);
        
    }
    
    @Override
    public void calcularAtivosFinanceiros(){
        double inv = 0;
        for (Investimento i: investimentos)
        {
           inv += i.getValor();
        }
        
        System.out.println("Seus Ativos Financeiros valem: " + inv + " Reais");
    }
    
    public double getTaxaCorretagem() {
        return taxaCorretagem;
    }

    public void setTaxaCorretagem(double taxaCorretagem) {
        this.taxaCorretagem = taxaCorretagem;
    }

    public boolean isPlataformaOnline() {
        return plataformaOnline;
    }

    public void setPlataformaOnline(boolean plataformaOnline) {
        this.plataformaOnline = plataformaOnline;
    }
    
}

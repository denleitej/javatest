
package com.mycompany.aula;


public class Venda {
    private int id;
    private double valor;
    private Comercio comercio;

    Venda(int id, double valor){
        this.id = id;
        this.valor = valor;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Comercio getC() {
        return comercio;
    }

    public void setComercio(Comercio c) {
        this.comercio = c;
    }
    
    
}


package com.mycompany.aula;


abstract class Juridica extends Cliente{
    public String nomeFantasia;
    public String cnpj;

    public Juridica(String u, String nomeFantasia, String cnpj) {
        this.usuario = u;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.validarCNPJ();
    }
    
    @Override
    public void imprimir(){
        System.out.println("\nNome: " + this.nomeFantasia);
        System.out.println("\nCNPJ: " + this.cnpj);
    }
    
    private void validarCNPJ(){
        System.out.println("CNPJ Validado!");
    }
    
}

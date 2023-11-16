
package com.mycompany.aula;


public class Fisica extends Cliente{
    
    private String nome;
    private String cpf;

    public Fisica(String u, String nome, String cpf) {
        this.usuario = u;
        this.nome = nome;
        this.cpf = cpf;
        this.validarCPF();
    }      
      
    private void validarCPF(){
        System.out.println("CPF Validado!");
    }
    
    public void imprimir(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nCPF: " + this.cpf);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}

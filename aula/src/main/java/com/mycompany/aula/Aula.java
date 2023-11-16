
package com.mycompany.aula;

import java.util.*;
public class Aula {

    public static void main(String[] args) {
        
        int opc, opc2;
        List<Cliente> clientes = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t -- Seja bem-vindo! --\n");
        System.out.println("Digite o número correspondente ao que deseja fazer e aperte enter para prosseguir:\n");
        System.out.println("1 - Cadastrar-se\n");
        System.out.println("2 - Investir em um estabelecimento cadastrado\n");
        System.out.println("3 - Fazer uma compra em um estabelecimento cadastrado\n");       
        System.out.println("4 - Calcular ativos financeiros de uma administradora");
        System.out.println("5 - Exibir dados");
        opc = scan.nextInt();
        
        switch(opc){
            
            case 1:
                System.out.println("1 - Cadastrar pessoa Fìsica");
                System.out.println("2 - Cadastrar pessoa Jurírica - Comércio");
                System.out.println("3 - Cadastrar pessoa Jurírica - Administradora");              
                    switch(scan.nextInt()){
                        case 1:
                            String u, n, cpf;
                                System.out.println("Digite um usuário");
                                u = scan.nextLine();
                                System.out.println("Digite seu Nome");
                                n = scan.nextLine();
                                System.out.println("Digite seu CPF");
                                cpf = scan.nextLine();
                                Fisica f1 = new Fisica(u, n, cpf);
                                clientes.add(f1);
                            break;
                        case 2:
                            String u, n, cnpj, r;
                                System.out.println("Digite um usuário");
                                u = scan.nextLine();
                                System.out.println("Digite o nome do comercio:");
                                n = scan.nextLine();
                                System.out.println("Digite seu CNPJ");
                                cnpj = scan.nextLine();
                                System.out.println("Digite seu ramo de operaçoes");
                                r = scan.nextLine();
                                Comercio c1 = new Comercio(u, n, cnpj, r);
                                clientes.add(c1);
                            break;
                        case 3:
                            String u, n, cnpj;
                            double tc;
                            boolean po;
                                System.out.println("Digite um usuário");
                                u = scan.nextLine();
                                System.out.println("Digite o nome do comercio:");
                                n = scan.nextLine();
                                System.out.println("Digite seu CNPJ");
                                cnpj = scan.nextLine();
                                System.out.println("Digite sua taxa de corretagem");
                                tc = scan.nextDouble();
                                System.out.println("Sua plataforma está online? true ou false");
                                po = scan.nextBoolean();
                                Administradora a1 = new Administradora(u, n, cnpj, tc, po);
                                clientes.add(a1);
                            break;
                    }
                break;
            case 2:
                break;
            case 3:
                break;
            
    
    }
        

        Fisica f2 = new Fisica("f1", "Astolfo", "54545488");
        Administradora a2 = new Administradora("a1", "Robs", "454545", 500, true);
        Comercio c2 = new Comercio("c1", "Zé", "4454545", "Atacado");
        
        a2.investir(10, 500);
        a2.investir(20, 500);
        a2.investir(30, 500);
        a2.investir(40, 500);
        a2.investir(50, 500);
        a2.investir(60, 500);
        
        a1.calcularAtivosFinanceiros();
        a1.imprimir();
    }
}

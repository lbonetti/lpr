/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Usuaria {
    public static void main(String[] args){
        boolean status=true;
        ControleMesaBar mesa = new ControleMesaBar(1);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Sensação Drinks Night (Sob nova direcao)");
        System.out.println("Escolha seus produtos: ");
        mesa.ListarProdutos();
        
        while(status==true){
            System.out.println("Informe o número do produto desejado: ");
            int n = scan.nextInt();
            System.out.println("Informe a quantidade");
            int q = scan.nextInt();
            mesa.AdicionarProduto(n, q); //chama o método que adiciona o valor do produto
            
            System.out.println("Deseja fazer mais pedidos?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            if(scan.nextInt()==2){ //condicao para verificar se usuario quer fazer mais pedidos
                status=false; 
            }
        }
        
        System.out.println("Gostaria de pagar a taxa de 10% ao garcom?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        if(scan.nextInt()==1){ //condicao para ver se usuario quer pagar a taxa do garcom
            mesa.TaxaGarcom(); //metodo que calcula a taxa do garcom
        }
        
        System.out.println("Gostaria de dividir o valor total com outras pessoas?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        if(scan.nextInt()==1){ //condicao para ver se usuario quer pagar a taxa do garcom
            System.out.println("Em quanta pessoas estão na mesa?");
            System.out.println("Valor por pessoa: " + mesa.DividirPorPessoa(scan.nextInt()));
        }
        
        System.out.println("Valor total: R$ " + mesa.valorTotal());
        
    }
    
}

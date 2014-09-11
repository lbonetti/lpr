/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio2;

/**
 *
 * @author Lucas
 */
public class Produtos {

    private String nome; //atributo privado nome
    private double valor; //atributo privado valor
    
    public Produtos(String nome, double valor){ //metodo construtor da classe produto, que ja define 
        this.nome=nome;                         // o nome e o valor do produto
        this.valor=valor;
    }

    public String DisplayProduto(){ //metodo que exibe o nome do produto
        return nome;
    }
    
    public double DisplayValor(){ //metodo que exibe o valor
        return valor;
    }

}

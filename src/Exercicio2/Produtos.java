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

    private String nome;
    private double valor;
    
    public Produtos(String nome, double valor){
        this.nome=nome;
        this.valor=valor;
    }

    public String DisplayProduto(){
        return nome;
    }
    
    public double DisplayValor(){
        return valor;
    }

}

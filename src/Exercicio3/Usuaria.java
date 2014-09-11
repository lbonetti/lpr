/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Usuaria {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a string a ser invertida: ");
        Inverter inv = new Inverter(); //instancia da classe para inverter
        
        StringBuffer str = new StringBuffer(scan.nextLine());
        System.out.println(inv.inverter(str)); //chama o método para inverter a string
    }
    
}

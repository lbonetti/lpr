package Exercicio4;

import java.util.Scanner;


public class Equacao2grau {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c; //declaracao das variaveis locais
        System.out.println("Bem vindo ao programa 'Calculo da equação de 2º grau'!!");
        System.out.println("\nModelo da equação: x² + x + 5 = 0 ");
        System.out.println("\nInforme o valor de a (x²):");
        a = s.nextDouble(); //obtem o valor de a
        System.out.println("Informe o valor de b (x):");
        b = s.nextDouble(); //obtem o valor de b
        System.out.println("Informe o valor de c (5):");
        c = s.nextDouble(); //obtem o valor de c
        
        EstruturaEquacao2grau e = new EstruturaEquacao2grau(a, b, c); //instancia da classe EstruturaEquacao2grau
        e.Resultado(); //exibe o resultado do calculo                 //passando os parametros a, b, c
    }
    
}

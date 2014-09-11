/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio4;

import static java.lang.Math.*; //importação da classe MATH que contém métodos úteis para os cálculos

/**
 *
 * @author Home
 */
public class EstruturaEquacao2grau {
    double x =0, y=0, z=0;
    public EstruturaEquacao2grau(double x, double y, double z) //metodo construtor
    {
        this.x = x; //recebe a entra os dados para a equação de 2 grau
        this.y = y;
        this.z = z;
    }
    
    public double Delta() //faz o calculo do Delta
    {
        double delta = 0;       
        delta = pow(y,2) - (4*x*z); //pow: potenciação      
        return delta; //retorna o delta
    }
    
    public void Resultado()
    {
        double resul = 0, resul0 = 0;
        
        resul = (-y + sqrt(Delta()))/(2*x); //calcula o valor com o Delta positivo
        resul0 = (-y - sqrt(Delta()))/(2*x); //calcula o valor com o Delta negativo
        
        if (Delta() < 0) //se delta for <0 , impossivel calcular
            System.out.println("\nImpossível calcular usando números reais!");
        else
            if(Delta() == 0) //se detlta for igual a zero, a equação terá solução única
            {
                if (resul > resul0) //considera o maior valor
                    System.out.println("\n1 resultado, valor: "+ resul);
                else
                    System.out.println("\n1 resultado, valor: "+ resul0);
            }
        else  //se delta for maior que 0, exibe as duas soluções
                System.out.println("\n2 resultados, valor 1: "+ resul+", valor 2: "+resul0);
    }                                                                        
}

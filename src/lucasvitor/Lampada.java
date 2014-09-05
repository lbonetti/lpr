/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Exercício 1

package lucasvitor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Lampada {
    private boolean status;
    private int vida;
    private boolean queimou;
    
    public Lampada (){
       status=false;
       vida=5;
       queimou=false;
    }
    
    public boolean Acende(){
        if(status==false && queimou==false){
            status=true;
            return status;}
        else
            return false;       
    }
    
    public boolean Apaga(){
        if(status==true && vida>1){
            vida--;
            status=false;
            return status;
        }
        else
            if (vida==1){
                queimou=true;
                return status;
            }
            else
            return true;
    }
    
    public boolean Status(){
        return status;
    }
    
    public boolean Queimou(){
        return queimou;
    }
    
    public int Vida(){
        return vida;
    }
    
    
}

class Usuario{
    public static void main(String[] args){
        Lampada l = new Lampada();
        
        while(l.Queimou()==false){
            System.out.println("Entre com a opção desejada: ");
            System.out.println("1. Acender Lampada");
            System.out.println("2. Apagar Lampada");
            System.out.println("3. Verificar Status");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            switch (opcao){
                case 1:
                if(l.Acende()==true)
                    System.out.println("A lampada foi acesa com sucesso.");
                else
                    System.out.println("A lampada nao pode ser acessa.");
                break;
            
                case 2:
                if(l.Apaga()==false && l.Vida()!=5)
                    System.out.println("A lampada foi apagada com sucesso.");
                else
                    System.out.println("A lampada nao pode ser apagada.");
                break;
                
                case 3:
                if(l.Status()==true)
                    System.out.println("A lampada está acesa.");
                else
                    System.out.println("A lampada está apagada.");
                break;
            }
        }
    }
}

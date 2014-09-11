/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Exercício 1

package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Lampada {
    private boolean status; //atributo privado que armazena o status da lampada
    private int vida; //atributo privado que armazena a vida util da lampada
    private boolean queimou; //atributo para controlar se a lampada esta queimada ou nao
    
    public Lampada (){ //método constutor da classe lampada
       status=false; //a lamapada começa apagada
       vida=5; //a lamapada começa com vida útil igual a 5
       queimou=false; //queimou inicia como falso
    }
    
    public boolean Acende(){ //metodo que acende a lampada
        if(status==false && queimou==false){ //verifica se a lampada esta apagada e não esta queimada
            status=true; //acende a lampada
            return status;} //retorna o status
        else
            return false; //caso não satisfaça a primeira condição, retorna false (a lamapada nao acende)      
    }
    
    public boolean Apaga(){ //metodo que apaga a lampada
        if(status==true && vida>1){ //verifica se a lampada esta acessa e tem vida util
            vida--; //decrementa uma vida 
            status=false; //apaga a lampada
            return status; //retorna o status
        }
        else 
            if (vida==1){ //caso nao satisfaça a primeira condição, verifica se a lampada queimou
                queimou=true; //caso sim, queimou = true
                return status; //retorna o status
            }
            else
            return true; //caso nao satisfaça nenhuma condição, retorna true (a lampada nao apaga)
    }
    
    public boolean Status(){ //metodo que retorna o status
        return status;
    }
    
    public boolean Queimou(){ //metodo que informa a classe Usuario se a lampada queimou
        return queimou;
    }
    
    public int Vida(){ //metodo que informa a classe Usuario a quantidade de vidas da lampada
        return vida;
    }
    
    
}

class Usuario{
    public static void main(String[] args){
        Lampada l = new Lampada(); //cria e instancia o objeto lampada 
        
        while(l.Queimou()==false){ //loop que é executado enquanto a lampada tiver vida util
            System.out.println("Entre com a opção desejada: ");
            System.out.println("1. Acender Lampada");
            System.out.println("2. Apagar Lampada");
            System.out.println("3. Verificar Status");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            switch (opcao){ //switch para verificar a ação do usuário
                case 1:
                if(l.Acende()==true) //verifica se a lampada acendeu
                    System.out.println("A lampada foi acesa com sucesso.");
                else
                    System.out.println("A lampada nao pode ser acessa.");
                break;
            
                case 2:
                if(l.Apaga()==false && l.Vida()!=5) //verifica se a lampada apagou
                    System.out.println("A lampada foi apagada com sucesso.");
                else
                    System.out.println("A lampada nao pode ser apagada.");
                break;
                
                case 3:
                if(l.Status()==true) //verifica o status da lampada
                    System.out.println("A lampada está acesa.");
                else
                    System.out.println("A lampada está apagada.");
                break;
            }
        }
    }
}

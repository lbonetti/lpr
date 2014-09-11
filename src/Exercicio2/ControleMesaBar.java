/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio2;

/**
 *
 * @author Aluno
 */
public class ControleMesaBar {
    private int nmesa; //numero da mesa
    private  double vtotal; //valor total
    public Produtos[] prod;//criando e instanciando um vetor do tipo Produtos
    
    public ControleMesaBar(int nmesa){ //construtor da classe ControleMesaBar
        prod = new Produtos[5];
        this.nmesa = nmesa;
        vtotal = 0;
        prod[0] = new Produtos("Lanche", 7);
        prod[1] = new Produtos("Pizza", 13);
        prod[2] = new Produtos("Pastel", 10);
        prod[3] = new Produtos("Agua", 2.50);
        prod[4] = new Produtos("Cerveja", 4.00);
    }
        
    public void ListarProdutos(){ //metodo que lista os produtos
        for (int i=0;i<prod.length;i++){
            System.out.println(i + ". " + prod[i].DisplayProduto() + " R$ " + prod[i].DisplayValor());
        }
    }
    
    public void AdicionarProduto(int i, int quantidade){ //metodo que adiciona o valor dos produtos
        this.vtotal = this.vtotal + (quantidade*prod[i].DisplayValor());
    }
    
    public void TaxaGarcom(){ //metodo que adiciona o valor da taxa do garcom
        vtotal = vtotal+(vtotal*0.1);
    }
    
    public double DividirPorPessoa(int qnt){ //metodo que divide o valor pelo numero de pessoas
        double vdividido = vtotal;
        return vdividido / qnt;
    }
    
    public double valorTotal(){ //metodo que retorna o valor total da mesa
        return vtotal;
    }
           
}

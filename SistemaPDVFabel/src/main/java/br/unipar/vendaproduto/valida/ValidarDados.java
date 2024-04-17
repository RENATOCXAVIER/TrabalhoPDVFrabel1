/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.valida;

import br.unipar.vendaproduto.model.Cliente;
import br.unipar.vendaproduto.model.ItemVenda;
import br.unipar.vendaproduto.model.Produto;
import br.unipar.vendaproduto.model.Venda;

import javax.swing.JOptionPane;

/**
//cbCliente
* cbProduto
* txtValorUnitario
* txtDescontoUni
* txtQtd
* 
* 
* 
 */
public class ValidarDados {
    
  private Cliente ncliente[] = new Cliente[1];
  private Produto nProdut[] = new Produto[1];
//  private itemVenda nVenda[] = new itemVenda[1];


  private int contProduto = 0;
  private int contClient = 0;
  private int contVenda = 0;   

 public ValidarDados(){
 
    Cliente mscliente = new Cliente(contClient,"Robson", "45998262081", "603.492.930-07");
    ncliente[contClient] = mscliente;
    contClient++;

    Produto msProduto = new Produto(contProduto, "Madioca");
    nProdut[contProduto] = msProduto;
    contProduto++;
    
//    ItemVenda msVenda = new ItemVenda();
//    nVenda[contVenda] = msVenda;
//    contVenda++;


  
 }

    /*, String produto*/

public boolean validarCliente(String cliente, String produto){
 boolean aux = false;
 for(int i=0; i< contClient;i++){
 if(ncliente[i].getNome().equals(cliente) && nProdut[i].getDescricao().equals(produto)){
 return true;
 
 }

 }
// for(int i = 0; i <contProduto;i++){
// if(nProdut[i].getDescricao().equals(produto)){
// return true;
// }
// }
 
 return false;
 }

//public boolean validarVendas(String descricao, double valor_tl, double desconto_tl,int qtd_total, double descontoUnit){
//for(int i =0;i <contVenda;i++){
//if(nVenda[i].getDesconto_total() <0 && nVenda[i].getValor_total()<=0 
//        && nVenda[i].getQtd_total_itens() <=0 && nVenda.getClass().getd{
//return true;
//}
//
//}
//return false;
//}

    

}



//public boolean validarVenda(String produto){
//
//    
//    
//    
//}

  
    

    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//   
//public boolean validarDadosVenda( Cliente id_cliente, 
//Produto  id_produto, double valor_total,  double desconto_total, int qtd_total_itens){
//
//
//      if(id_cliente == null){
//      
//      JOptionPane.showMessageDialog(null,"Selecione o usuario ");
//      return false;
//      }
//      if(id_produto == null){
//      JOptionPane.showMessageDialog(null,"Selecione o usuario ");
//      return false;
//      }
//      if(valor_total <=0){
//     
//      JOptionPane.showMessageDialog(null,"Valor total menor que zero é invalido! ");
//      return false;
//      }
//      if(valor_total <=0){
//     
//      JOptionPane.showMessageDialog(null,"Valor total menor que zero é invalido! ");
//      return false;
//      }
//      if(valor_total <=0){
//     
//      JOptionPane.showMessageDialog(null,"Valor total menor que zero é invalido! ");
//      return false;
//      }
//      else{
//      return true;
//      }
//
//
//}
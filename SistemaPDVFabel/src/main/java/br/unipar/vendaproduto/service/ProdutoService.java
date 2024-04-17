/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.service;

import br.unipar.vendaproduto.implement.ProdutoRepositoryImp;
import br.unipar.vendaproduto.model.Produto;
import br.unipar.vendaproduto.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author renat
 */
public class ProdutoService {
     
      
       
     public Produto insert(Produto produto){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).insert(produto);
     }
     
     public Produto findById(Integer id){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).findById(id);
     }
     
     public List<Produto> findAll(Integer id){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).findAll();
     }
     
     public List<Produto> findByDesc(String descricao){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).findByDesc(descricao);
     }
     
     public Produto update(Produto produto){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).update(produto);
     }
     
     public boolean delete(Produto produto){
         return new ProdutoRepositoryImp(EntityManagerUtil.getManager()).delete(produto);
     }
}

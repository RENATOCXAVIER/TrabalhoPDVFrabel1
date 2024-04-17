/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.repository;

import br.unipar.vendaproduto.model.Produto;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author renat
 */
public interface ProdutoRepositorio {
   
    
    Produto insert(Produto produto);
    Produto findById(Integer id); 
    List<Produto> findAll();
    Produto update(Produto produto);
    Boolean delete(Produto produto);

}
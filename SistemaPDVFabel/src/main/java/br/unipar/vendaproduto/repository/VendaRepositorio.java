/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.repository;

import br.unipar.vendaproduto.model.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author renat
 */
public interface VendaRepositorio {
     Venda insert(Venda venda) throws Exception;
    Venda findById(Integer id); 
    List<Venda> findAll();
    Venda update(Venda venda);
    Boolean delete(Venda venda);
}
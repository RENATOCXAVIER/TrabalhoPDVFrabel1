/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.repository;

import br.unipar.vendaproduto.model.Cliente;
import jakarta.persistence.EntityManager;
import java.util.List;






public interface ClienteRepositorio {
    
     Cliente insert(Cliente cliente);
    Cliente findById(Integer id); 
    List<Cliente> findAll();
    Cliente update(Cliente cliente);
    Boolean delete(Cliente cliente);
}

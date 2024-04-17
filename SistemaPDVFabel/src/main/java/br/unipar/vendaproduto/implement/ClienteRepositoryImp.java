/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.implement;

import br.unipar.vendaproduto.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author renat
 */
public class ClienteRepositoryImp {
       private EntityManager entityManager;

    public ClienteRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Cliente findById(Integer id) {
        return entityManager.find(Cliente.class, id);
    }


    public List<Cliente> findAll() {
        return entityManager.createQuery("SELECT C FROM Cliente C",
                Cliente.class).getResultList();               
    }
    
    public List<Cliente> findByName(String name){
        return entityManager.createQuery("SELECT C FROM Cliente C WHERE C.NM_CLIENTE LIKE UPPER(%"+name.toUpperCase()+"%)",
                Cliente.class).getResultList();      
    }

    
    public Cliente insert(Cliente cliente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cliente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente salvo com sucesso!");
        return cliente;
    }

  
    public Cliente update(Cliente cliente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(cliente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente atualizado com sucesso!");
        return cliente;
    }

   
    public Boolean delete(Cliente cliente) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(cliente);
            transaction.commit();
            entityManager.close();

            System.out.println("Cliente removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Cliente atualizado com sucesso!");
            return false;
        }
    }
}

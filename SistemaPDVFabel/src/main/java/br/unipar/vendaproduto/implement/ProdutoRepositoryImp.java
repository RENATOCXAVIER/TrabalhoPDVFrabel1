/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.implement;

import br.unipar.vendaproduto.model.Produto;
import br.unipar.vendaproduto.repository.ProdutoRepositorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author renat
 */
public class ProdutoRepositoryImp implements ProdutoRepositorio{
        private EntityManager entityManager;

        public ProdutoRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
        }

        public Produto findById(Integer id) {
        return entityManager.find(Produto.class, id);
        }


        public List<Produto> findAll() {
        return entityManager.createQuery("SELECT PD FROM Produto PD",
               Produto.class).getResultList();               
        }

        public List<Produto> findByDesc(String descricao){
        return entityManager.createQuery
        ("SELECT PD FROM Produto PD WHERE PD.DS_PRODUTO LIKE UPPER(%"
        +descricao.toUpperCase()+"%)",
        Produto.class).getResultList();      
        }

        @Override
        public Produto insert(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(produto);
        transaction.commit();
        entityManager.close();

        System.out.println("Produto salvo com sucesso!");
        return produto;
        }

        @Override
        public Produto update(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(produto);
        transaction.commit();
        entityManager.close();

        System.out.println("Produto atualizado!");
        return produto;
        }

        @Override
        public Boolean delete(Produto produto) {        
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.remove(produto);
            transaction.commit();
            entityManager.close();

            System.out.println("Produto removido!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Produto atualizado!");
            return false;
        }
        }
}

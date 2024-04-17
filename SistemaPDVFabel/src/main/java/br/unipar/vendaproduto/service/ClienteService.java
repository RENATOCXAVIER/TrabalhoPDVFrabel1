/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.service;

import br.unipar.vendaproduto.implement.ClienteRepositoryImp;
import br.unipar.vendaproduto.model.Cliente;
import br.unipar.vendaproduto.repository.ClienteRepositorio;
import br.unipar.vendaproduto.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author renat
 */
public class ClienteService {
    
    public Cliente insert(Cliente cliente){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).insert(cliente);
    }
    
    public Cliente findById(Integer id){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).findById(id);
    }

    public List<Cliente> findAll(Integer id){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).findAll();
    }

    public List<Cliente> findByName(String name){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).findByName(name);
    }
    
    public Cliente update(Cliente cliente){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).update(cliente);
    }
    
    public boolean delete(Cliente cliente){
        return new ClienteRepositoryImp(EntityManagerUtil.getManager()).delete(cliente);
    }
}
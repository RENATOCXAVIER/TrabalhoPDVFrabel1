/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.service;

import br.unipar.vendaproduto.implement.VendaRepositoryImp;
import br.unipar.vendaproduto.model.Venda;
import br.unipar.vendaproduto.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author renat
 */
public class VendaService {
        
    public Venda insert(Venda venda) throws Exception{
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).insert(venda);
    }
    
    public Venda findById(Integer id){
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).findById(id);
    }
    
    public List<Venda> findAll() {
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).findAll();
    }
    
    public Venda update(Venda venda) throws Exception{
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).update(venda);
    }
    
    public boolean delete(Venda venda) throws Exception{
        return new VendaRepositoryImp(EntityManagerUtil.getManager()).delete(venda);
    }
}

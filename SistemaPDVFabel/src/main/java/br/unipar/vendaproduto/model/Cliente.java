
package br.unipar.vendaproduto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Dzkyy
 */



@Entity
@Table(name = "tb_cliente")
public class Cliente {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;
    @Column(name ="nome")
    private String nome;
    @Column(name ="telefone")
    private String telefone;
    @Column(name = "cpf")
    private String cpf;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nome, String telefone, String cpf) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    
    
    
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
}

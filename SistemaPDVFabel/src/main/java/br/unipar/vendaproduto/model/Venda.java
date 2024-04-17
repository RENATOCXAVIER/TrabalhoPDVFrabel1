/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;


/**
 *
 * @author Dzkyy
 */
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Cliente id_cliente;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<ItemVenda> itemVenda;
    @Column(name = "valor_total")
    private double valor_total;
    @Column(name = "desconto_total")
    private double desconto_total;
    @Column(name = "qtd_total_itens")
    private int qtd_total_itens;

    public Venda() {
    }

    public Venda(int id, Cliente id_cliente, double valor_total, double desconto_total, int qtd_total_itens) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.valor_total = valor_total;
        this.desconto_total = desconto_total;
        this.qtd_total_itens = qtd_total_itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getDesconto_total() {
        return desconto_total;
    }

    public void setDesconto_total(double desconto_total) {
        this.desconto_total = desconto_total;
    }

    public int getQtd_total_itens() {
        return qtd_total_itens;
    }

    public void setQtd_total_itens(int qtd_total_itens) {
        this.qtd_total_itens = qtd_total_itens;
    }

    public List<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda( List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }





    
    
}

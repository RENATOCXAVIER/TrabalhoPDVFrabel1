/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.vendaproduto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import javax.persistence.OneToOne;




@Entity
@Table(name = "tb_item_venda")

public class ItemVenda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @OneToOne
     private Produto id_produto;
     @ManyToOne
     private Venda id_venda;
     @Column(name ="descricao")
     private String Descricao;
     @Column(name ="qtd")
     private int qtd;
     @Column(name ="vlr_unit")
     private double valor_unitario;
     @Column(name ="vlr_total")
     private double valor_total;
     @Column(name ="desconto_un")
     private double desconto_unitario;

    public ItemVenda() {
    }

    public ItemVenda(Produto id_produto, Venda id_venda, String Descricao, int qtd, double valor_unitario, double valor_total, double desconto_unitario) {
        this.id_produto = id_produto;
        this.id_venda = id_venda;
        this.Descricao = Descricao;
        this.qtd = qtd;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
        this.desconto_unitario = desconto_unitario;
    }

    public Produto getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produto id_produto) {
        this.id_produto = id_produto;
    }

    public Venda getId_venda() {
        return id_venda;
    }

    public void setId_venda(Venda id_venda) {
        this.id_venda = id_venda;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getDesconto_unitario() {
        return desconto_unitario;
    }

    public void setDesconto_unitario(double desconto_unitario) {
        this.desconto_unitario = desconto_unitario;
    }


    
}

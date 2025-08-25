package com.fatec.ams.loja;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="cesta")
public class CestaEntity {
    @Id
    private int codigo;
    private int codigoProduto;
    private String nomeProduto;
    private int codigoCliente;
    private int quantidade;
    private double valorItem;
    private double totalItem;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValorItem() {
        return valorItem;
    }
    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
    public double getTotalItem() {
        return totalItem;
    }
    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Negocio;

import Modelo.Produto;
import java.util.Date;

/**
 * Classe que faz o controle de stock
 *
 * @author Paulo Amosse
 */
public class Stock {

    private Integer id;
    private Produto produto;
    private Date dataRegisto;
    private Date prazoValidade;
    private double preco;
    private int quantidade;
    private double valorCompra;
    private double valorVenda;
    private boolean status;

    public Stock() {
        this.dataRegisto = new Date();
    }

    public Integer getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataRegisto() {
        return dataRegisto;
    }

    public void setDataRegisto(Date dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(Date prazoValidade) {
        this.prazoValidade = prazoValidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Adicione uma quantidade valida ao stock e actualize simultaneamente o
     * stock para o produto da validade x, e para o produto bruto.
     *
     * @param quantidade
     */
    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
        produto.setQuantidadeTotal(produto.getQuantidadeTotal() + quantidade);
    }

}

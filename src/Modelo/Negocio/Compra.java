/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Negocio;

import Modelo.Parcela;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Paulo Amosse
 */
public class Compra {

    private Integer id;
    private Date dataCompra;
    private Date horaCompra;
    //Lista de produtos a comprar
    private Set<ItemCompra> itens = new HashSet<>();
    private double divida; //caso o dinheiro disponivel nao chegue para a compra, este campo sera activado com o valor em falta
    private double valorTotal;
    private boolean status;

    public Compra() {
        this.dataCompra = new Date();
        this.horaCompra = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Date getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Date horaCompra) {
        this.horaCompra = horaCompra;
    }

    public Set<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(Set<ItemCompra> itens) {
        this.itens = itens;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

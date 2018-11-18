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
public class Venda {

    private Integer id;
    private Date dataCompra;
    private Date horaCompra;
    //Lista de produtos a comprar
    //Deve haver quantidade minima para pagamento por parcela
    private Set<Parcela> parcelas = new HashSet<>();
    private Set<ItemVenda> itens = new HashSet<>();
    private double divida; //caso o dinheiro disponivel nao chegue para a compra, este campo sera activado com o valor em falta
    private double valorTotal;
    private boolean status;

    public Venda() {
        this.dataCompra = new Date();
        this.horaCompra = new Date();
    }
    
    
}

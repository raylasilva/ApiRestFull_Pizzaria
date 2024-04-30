package com.soulcode.ApiRestFull.Models;

import jakarta.persistence.*;

@Entity
public class PizzaPedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaPedida;

    @OneToOne
    @JoinColumn(nullable = false, name = "idPedido")
    private Pedido idPedido;

    @OneToOne
    @JoinColumn(nullable = false, name = "idPizza")
    private Pizza idPizza;

    @OneToOne
    @JoinColumn(nullable = false, name = "idTamanho")
    private Tamanho idTamanho;

    @Column(nullable = false)
    private int quantidade;

    public PizzaPedida() {
    }

    public long getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(long idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Pizza getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Pizza idPizza) {
        this.idPizza = idPizza;
    }

    public Tamanho getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(Tamanho idTamanho) {
        this.idTamanho = idTamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

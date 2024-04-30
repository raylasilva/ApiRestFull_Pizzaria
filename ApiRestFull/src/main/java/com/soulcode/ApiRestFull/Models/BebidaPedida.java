package com.soulcode.ApiRestFull.Models;

import jakarta.persistence.*;

@Entity
public class BebidaPedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebidaPedida;
    @OneToOne
    @JoinColumn(nullable = false, name = "idPedido")
    private Pedido idPedido;

    @OneToOne
    @JoinColumn(nullable = false, name = "idBebida")
    private Bebida idBebida;

    @Column(nullable = false)
    private int quantidade;

    public BebidaPedida() {
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Bebida getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(Bebida idBebida) {
        this.idBebida = idBebida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

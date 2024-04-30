package com.soulcode.ApiRestFull.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.LazyToOne;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue
    private long idPedido;

    @OneToOne
    @JoinColumn(nullable = false, name = "idCliente")
    private Cliente idCliente;

    @OneToOne
    @JoinColumn(nullable = false, name="idFornada")
    private Fornada idFornada;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora;

    public Pedido() {
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Fornada getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(Fornada idFornada) {
        this.idFornada = idFornada;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}

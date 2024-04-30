package com.soulcode.ApiRestFull.Models;

import jakarta.persistence.*;

@Entity
public class Bebida {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebida;

    @Column(nullable = false,length = 50)
    private String nome;

    @Column(nullable = false)
    private float preco;

    public Bebida() {
    }

    public long getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(long idBebida) {
        this.idBebida = idBebida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

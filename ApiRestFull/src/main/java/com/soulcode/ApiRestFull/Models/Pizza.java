package com.soulcode.ApiRestFull.Models;

import jakarta.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizza;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false)
    private float precoBase;

    @Column(nullable = false)
    private boolean personalizada;

    public Pizza() {
    }

    public long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(long idPizza) {
        this.idPizza = idPizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }
}

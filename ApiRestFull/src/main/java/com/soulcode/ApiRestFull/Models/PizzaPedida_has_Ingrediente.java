package com.soulcode.ApiRestFull.Models;

import jakarta.persistence.*;

@Entity
public class PizzaPedida_has_Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaIngrediente;
    @OneToOne
    @JoinColumn(nullable = false, name = "idPizzaPedida")
    private PizzaPedida idPizzaPedida;

    @OneToOne
    @JoinColumn(nullable = false, name = "idIngrediente")
    private Ingrediente idIngrediente;
}

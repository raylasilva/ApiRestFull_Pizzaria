package com.soulcode.ApiRestFull.Controllers;


import com.soulcode.ApiRestFull.Models.Pizza;
import com.soulcode.ApiRestFull.Repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @PostMapping("/criarPizza")
    public Pizza criar(){
        Pizza pizza = new Pizza();
        pizza.setNome("Calabresa");
        pizza.setPersonalizada(true);
        pizza.setPrecoBase(35);
        pizza =pizzaRepository.save(pizza);
        return pizza;
    }
    @GetMapping("/mostrarPizza")
    public List<Pizza> findAll(){
        List<Pizza> pizzas = pizzaRepository.findAll();
        return pizzas;
    }

    @GetMapping("/mostrarpizza/{idPizza}")
    public Pizza findById(@PathVariable long idPizza){
        Optional<Pizza> resultado = pizzaRepository.findById(idPizza);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Pizza não encontrada");
        }
        else{
            return resultado.get();
        }
    }

    @PutMapping("/alterarpizza/{idPizza}")
    public Pizza update(@PathVariable long idPizza, @RequestBody Pizza pizza){
        findById(idPizza);
        pizza.setIdPizza(idPizza);
        pizza = pizzaRepository.save(pizza);
        return pizza;
    }
//
    @DeleteMapping("/deletarpizza/{idPizza}")
    public Pizza deletar(@PathVariable long idPizza){
        Pizza pizza = findById(idPizza);
        pizzaRepository.deleteById(idPizza);
        return pizza;
    }
}

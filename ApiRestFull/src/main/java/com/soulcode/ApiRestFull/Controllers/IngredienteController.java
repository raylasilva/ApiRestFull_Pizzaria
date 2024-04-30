package com.soulcode.ApiRestFull.Controllers;

import com.soulcode.ApiRestFull.Models.Bebida;
import com.soulcode.ApiRestFull.Models.Ingrediente;
import com.soulcode.ApiRestFull.Repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IngredienteController {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @PostMapping("/criarIngrediente")
    public Ingrediente criar(){
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome("Massa de tomate");
        ingrediente.setPreco(6);
        ingrediente = ingredienteRepository.save(ingrediente);
        return ingrediente;
    }

    @GetMapping("/mostrarIngrediente")
    public List<Ingrediente> findAll(){
        List<Ingrediente> ingredientes = ingredienteRepository.findAll();
        return ingredientes;
    }

    @GetMapping("/mostraringrediente/{idIngrediente}")
    public Ingrediente findById(@PathVariable long idIngrediente){
        Optional<Ingrediente> resultado = ingredienteRepository.findById(idIngrediente);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Ingrediente não encontrada");
        }
        else{
            return resultado.get();
        }

    }

    @PutMapping("/alteraringrediente/{idIngrediente}")
    public Ingrediente alterar(@PathVariable long idIngrediente, @RequestBody Ingrediente ingrediente){
        findById(idIngrediente);
        ingrediente.setIdIngrediente(idIngrediente);
        ingrediente = ingredienteRepository.save(ingrediente);
        return ingrediente;
    }

    @DeleteMapping("/deletaringrediente/{idIngrediente}")
    public Ingrediente deletar(@PathVariable long idIngrediente){
        Ingrediente ingrediente = findById(idIngrediente);
        ingredienteRepository.deleteById(idIngrediente);
        return ingrediente;
    }
}

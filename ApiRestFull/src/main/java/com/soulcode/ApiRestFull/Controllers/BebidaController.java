package com.soulcode.ApiRestFull.Controllers;

import com.soulcode.ApiRestFull.Models.Bebida;
import com.soulcode.ApiRestFull.Repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository;

    //Criar
    @PostMapping("/criarBebida")
    public Bebida save(){
        Bebida bebida = new Bebida();
        bebida.setNome("Coca-Cola");
        bebida.setPreco(10);
        bebida = bebidaRepository.save(bebida);
        return bebida;
    }

    //Mostrar tudo
    @GetMapping("/mostrarbebidas")
    public List<Bebida> findAll(){
        List<Bebida> bebidas = bebidaRepository.findAll();
        return bebidas;
    }

    //Mostrar por id
    @GetMapping("/mostrarbebidas/{idBebida}")
    public Bebida findById(@PathVariable long idBebida){
        Optional<Bebida> resultado = bebidaRepository.findById(idBebida);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Bebida não encontrada");
        }
        else{
            return resultado.get();
        }

    }

    //Alterar bebida
    @PutMapping("/alterarbebida/{idBebida}")
    public Bebida update(@PathVariable long idBebida, @RequestBody Bebida bebida){
        findById(idBebida);
        bebida.setIdBebida(idBebida);
        bebida = bebidaRepository.save(bebida);
        return bebida;
    }

    //Deletar bebida
    @DeleteMapping("/deletar/{idBebida}")
    public Bebida deleteById(@PathVariable long idBebida){
       Bebida bebida = findById(idBebida);
       bebidaRepository.deleteById(idBebida);
       return bebida;

    }


}

package com.soulcode.ApiRestFull.Controllers;

import com.soulcode.ApiRestFull.Models.Bebida;
import com.soulcode.ApiRestFull.Models.Cliente;
import com.soulcode.ApiRestFull.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/criarCliente")
    public Cliente criar() {
        Cliente cliente = new Cliente();
        cliente.setNome("Jose Silva");
        cliente.setLogin("jose@gmail.com");
        cliente.setSenha("1234");
        cliente.setTelefone("(31) 8547-5236");
        cliente.setEndereco("rua pacata 19, BH, MG");
        cliente = clienteRepository.save(cliente);
        return cliente;
    }

    @GetMapping("/mostrarcliente")
    public List<Cliente> findAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    @GetMapping("/mostrarcliente/{idCliente}")
    public Cliente findById(@PathVariable long idCliente){
        Optional<Cliente> resultado = clienteRepository.findById(idCliente);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Cliente não encontrada");
        }
        else{
            return resultado.get();
        }
    }

    @PutMapping("/alterarcliente/{idCliente}")
    public Cliente alterar(@PathVariable long idCliente, @RequestBody Cliente cliente){
        findById(idCliente);
        cliente.setIdCliente(idCliente);
        cliente = clienteRepository.save(cliente);
        return cliente;

    }

    @DeleteMapping("/deletarcliente/{idCliente}")
    public Cliente deletar(@PathVariable long idCliente) {
        Cliente cliente = findById(idCliente);
        clienteRepository.deleteById(idCliente);
        return cliente;

    }
}

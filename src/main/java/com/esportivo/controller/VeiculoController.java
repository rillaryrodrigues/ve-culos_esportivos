package com.esportivo.controller;

import com.esportivo.model.Veiculo;
import com.esportivo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo) {
        return service.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Veiculo buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/status/{status}")
    public List<Veiculo> filtrarStatus(@PathVariable String status) {
        return service.porStatus(status);
    }

    @GetMapping("/ano/{ano}")
    public List<Veiculo> filtrarAno(@PathVariable int ano) {
        return service.porAno(ano);
    }

    @GetMapping("/preco/{preco}")
    public List<Veiculo> filtrarPreco(@PathVariable double preco) {
        return service.porPreco(preco);
    }
}

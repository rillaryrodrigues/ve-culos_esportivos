package com.esportivo.service;

import com.esportivo.model.Veiculo;
import com.esportivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public Veiculo salvar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Veiculo> porStatus(String status) {
        return repository.findByStatus(status);
    }

    public List<Veiculo> porAno(int ano) {
        return repository.findByAnoFabricacao(ano);
    }

    public List<Veiculo> porPreco(double preco) {
        return repository.findByPrecoLessThanEqual(preco);
    }
}

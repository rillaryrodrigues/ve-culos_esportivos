package com.esportivo.repository;

import com.esportivo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByStatus(String status);
    List<Veiculo> findByAnoFabricacao(int ano);
    List<Veiculo> findByPrecoLessThanEqual(double preco);
}

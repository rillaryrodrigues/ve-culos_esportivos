package com.esportivo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cor;
    private int anoFabricacao;
    private double preco;
    private int quilometragem;
    private String status; // disponível, vendido

    @ManyToOne
    private Modelo modelo;
}

package org.example.estacionamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ResumoDaLocacao {

    @Id @GeneratedValue
    Long id;

    @OneToOne
    private LocacaoDaVaga locacaoDaVaga;

    private Double valor;

    private String comentario;

}

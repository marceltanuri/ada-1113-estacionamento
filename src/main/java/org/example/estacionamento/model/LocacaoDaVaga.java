package org.example.estacionamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class LocacaoDaVaga {

    public LocacaoDaVaga() {
    }

    public LocacaoDaVaga(Vaga vaga, Veiculo veiculo, LocalDateTime inicio) {
        this.vaga = vaga;
        this.veiculo = veiculo;
        this.inicio = inicio;
    }

    @Id @GeneratedValue
    Long id;

    @OneToOne
    Vaga vaga;

    @OneToOne
    Veiculo veiculo;

    LocalDateTime inicio;

    LocalDateTime fim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
}

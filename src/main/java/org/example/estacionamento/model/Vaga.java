package org.example.estacionamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vaga {

    public Vaga() {
    }

    public Vaga(Long id, boolean ocupada) {
        this.id = id;
        this.ocupada = ocupada;
    }

    @Id @GeneratedValue
    Long id;

    boolean ocupada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}

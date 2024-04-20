package org.example.estacionamento.service;

import jakarta.annotation.PostConstruct;
import org.example.estacionamento.model.Vaga;
import org.example.estacionamento.repository.VagaRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    private VagaRepository repository;

    public VagaService(VagaRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void carregarVagas(){
        for(int i = 0; i < 20; i++){
            repository.save(new Vaga());
        }
    }



}

package org.example.estacionamento.service;

import org.example.estacionamento.model.LocacaoDaVaga;
import org.example.estacionamento.model.ResumoDaLocacao;
import org.example.estacionamento.model.Vaga;
import org.example.estacionamento.model.Veiculo;
import org.example.estacionamento.repository.LocacaoDaVagaRepository;
import org.example.estacionamento.repository.VagaRepository;
import org.example.estacionamento.repository.VeiculoRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LocacaoDaVagaService {

    private LocacaoDaVagaRepository locacaoDaVagaRepository;
    private VagaRepository vagaRepository;

    private VeiculoRepository veiculoRepository;

    public LocacaoDaVagaService(LocacaoDaVagaRepository locacaoDaVagaRepository, VagaRepository vagaRepository, VeiculoRepository veiculoRepository) {
        this.locacaoDaVagaRepository = locacaoDaVagaRepository;
        this.vagaRepository = vagaRepository;
        this.veiculoRepository = veiculoRepository;
    }

    public LocacaoDaVaga locarVaga(Vaga vaga, Veiculo veiculo){
        veiculoRepository.existsById(veiculo.getPlaca());
        // verificar veiculo


        // verificar vaga disponivel
        boolean vagaDisponivel = vagaRepository.exists(Example.of(new Vaga(vaga.getId(), false)));

        // ocupar vaga
        vaga.setOcupada(true);

        LocacaoDaVaga locacaoDaVaga = new LocacaoDaVaga(vaga, veiculo, LocalDateTime.now());

        locacaoDaVagaRepository.save(locacaoDaVaga);

        return locacaoDaVaga;
    }

    public LocacaoDaVaga desalocarVaga(Vaga vaga, Veiculo veiculo){
        // vericar veiculo
        // verificar vaga
        // desocupar vaga
        return null;
    }

    public ResumoDaLocacao obterResumoDaLocacao(LocacaoDaVaga locacaoDaVaga){
        return null;
    }

}

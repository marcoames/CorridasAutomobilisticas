package com.example.negocio.servicos;

import java.util.List;

import com.example.negocio.entidades.Piloto;
import com.example.negocio.repositorios.IPilotoRepository;

import org.springframework.stereotype.Component;

@Component
public class ServicoPiloto {
    private IPilotoRepository pilotoRepository;

    public ServicoPiloto(IPilotoRepository pilotoRepository) {
        this.pilotoRepository = pilotoRepository;
    }

    public List<Piloto> todos() {
        return pilotoRepository.todos();
    }

    public void cadastraPiloto(Piloto piloto) {
        pilotoRepository.cadastra(piloto);
    }
}

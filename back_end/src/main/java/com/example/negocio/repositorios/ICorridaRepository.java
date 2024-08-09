package com.example.negocio.repositorios;

import java.util.List;

import com.example.negocio.entidades.Corrida;

public interface ICorridaRepository {
    List<Corrida> todos();
    boolean cadastra(Corrida corrida);
}

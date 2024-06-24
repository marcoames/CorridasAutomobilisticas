package com.example.negocio.repositorios;

import java.util.List;

import com.example.negocio.entidades.Carro;

public interface ICarroRepository {
    List<Carro> todos();
    boolean cadastra(Carro carro);
}

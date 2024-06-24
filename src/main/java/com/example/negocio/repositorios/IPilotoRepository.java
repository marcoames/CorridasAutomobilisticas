package com.example.negocio.repositorios;

import java.util.List;

import com.example.negocio.entidades.Piloto;

public interface IPilotoRepository {
    List<Piloto> todos();
    boolean cadastra(Piloto piloto);
}

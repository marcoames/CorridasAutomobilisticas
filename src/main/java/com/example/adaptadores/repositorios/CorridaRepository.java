package com.example.adaptadores.repositorios;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.negocio.entidades.Corrida;
import com.example.negocio.repositorios.ICorridaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CorridaRepository extends JpaRepository<Corrida, Long>, ICorridaRepository {

    @Override
    default List<Corrida> todos() {
        return findAll();
    }

    @Override
    default boolean cadastra(Corrida corrida) {
        save(corrida);
        return true;
    }
}

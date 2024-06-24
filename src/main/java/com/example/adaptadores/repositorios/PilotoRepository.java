package com.example.adaptadores.repositorios;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.negocio.entidades.Piloto;
import com.example.negocio.repositorios.IPilotoRepository;

public interface PilotoRepository extends JpaRepository<Piloto, Long>, IPilotoRepository {
    @Override
    default List<Piloto> todos() {
        return findAll();
    }

    @Override
    default boolean cadastra(Piloto piloto) {
        save(piloto);
        return true;
    }
}

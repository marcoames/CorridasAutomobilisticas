package com.example.adaptadores.repositorios;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.negocio.entidades.Carro;
import com.example.negocio.repositorios.ICarroRepository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>, ICarroRepository {

    @Override
    default List<Carro> todos() {
        return findAll();
    }

    @Override
    default boolean cadastra(Carro carro) {
        save(carro);
        return true;
    }
}


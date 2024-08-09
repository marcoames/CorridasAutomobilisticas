package com.example.negocio.servicos;

import java.util.List;

import com.example.negocio.entidades.Carro;
import com.example.negocio.repositorios.ICarroRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoCarro {
    public ICarroRepository carroRep;

    //@Autowired
    public ServicoCarro(ICarroRepository carroRep){
        this.carroRep = carroRep;
    }

    public List<Carro> todos(){
        return carroRep.todos();
    }

    public void cadastraCarro(Carro carro){
        carroRep.cadastra(carro);
    }
    
}

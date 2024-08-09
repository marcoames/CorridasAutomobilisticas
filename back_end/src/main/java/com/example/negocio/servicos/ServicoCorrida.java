package com.example.negocio.servicos;

import java.util.List;

import com.example.negocio.entidades.Corrida;
import com.example.negocio.repositorios.ICorridaRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoCorrida {
    private ICorridaRepository corridaRep;

    //@Autowired
    public ServicoCorrida(ICorridaRepository corridaRep){
        this.corridaRep = corridaRep;
    } 

    public List<Corrida> todos(){
        return corridaRep.todos();
    }

    public void cadastra(String placa, Corrida corrida){
        corridaRep.cadastra(corrida);
    }
    
}

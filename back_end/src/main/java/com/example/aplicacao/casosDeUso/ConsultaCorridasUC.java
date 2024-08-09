package com.example.aplicacao.casosDeUso;

import java.util.List;

import com.example.negocio.entidades.Corrida;
import com.example.negocio.servicos.ServicoCorrida;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaCorridasUC {
    private ServicoCorrida servicoCorrida;

    //@Autowired
    public ConsultaCorridasUC(ServicoCorrida servicoCorrida) {
        this.servicoCorrida = servicoCorrida;
    }
    
    public List<Corrida> run(){
        return servicoCorrida.todos();
    }    
    
}

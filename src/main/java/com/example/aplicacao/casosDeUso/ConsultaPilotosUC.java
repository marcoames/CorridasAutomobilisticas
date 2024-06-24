package com.example.aplicacao.casosDeUso;

import java.util.List;

import com.example.negocio.entidades.Piloto;
import com.example.negocio.servicos.ServicoPiloto;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaPilotosUC {
    private ServicoPiloto servicoPiloto;

    //@Autowired
    public ConsultaPilotosUC(ServicoPiloto servicoPiloto) {
        this.servicoPiloto = servicoPiloto;
    }
    
    public List<Piloto> run(){
        return servicoPiloto.todos();
    }    
    
}
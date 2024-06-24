package com.example.aplicacao.casosDeUso;

import com.example.negocio.entidades.Corrida;
import com.example.negocio.servicos.ServicoCorrida;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraCorridaUC {
    private ServicoCorrida servicoCorrida;

    //@Autowired
    public CadastraCorridaUC(ServicoCorrida servicoCorrida) {
        this.servicoCorrida = servicoCorrida;
    }
    
    public void run(String placa, Corrida corrida){
        servicoCorrida.cadastra(placa, corrida);
    }    
}

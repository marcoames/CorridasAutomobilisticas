package com.example.aplicacao.casosDeUso;

import com.example.negocio.entidades.Piloto;
import com.example.negocio.servicos.ServicoPiloto;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraPilotoUC {
    private ServicoPiloto servicoPiloto;

    //@Autowired
    public CadastraPilotoUC(ServicoPiloto servicoPiloto) {
        this.servicoPiloto = servicoPiloto;
    }
    
    public void run(Piloto piloto){
        servicoPiloto.cadastraPiloto(piloto);
    }
}

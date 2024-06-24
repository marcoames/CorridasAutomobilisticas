package com.example.aplicacao.casosDeUso;

import com.example.negocio.entidades.Carro;
import com.example.negocio.servicos.ServicoCarro;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraCarroUC {
    private ServicoCarro servicoCarro;

    //@Autowired
    public CadastraCarroUC(ServicoCarro servicoCarro) {
        this.servicoCarro = servicoCarro;
    }
    
    public void run(Carro carro){
        servicoCarro.cadastraCarro(carro);
    }
    
}

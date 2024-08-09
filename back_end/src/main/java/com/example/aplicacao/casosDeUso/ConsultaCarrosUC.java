package com.example.aplicacao.casosDeUso;

import java.util.List;

import com.example.negocio.entidades.Carro;
import com.example.negocio.servicos.ServicoCarro;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaCarrosUC {
    private ServicoCarro servicoCarro;

    //@Autowired
    public ConsultaCarrosUC(ServicoCarro servicoCarro) {
        this.servicoCarro = servicoCarro;
    }
    
    public List<Carro> run(){
        return servicoCarro.todos();
    }    
}

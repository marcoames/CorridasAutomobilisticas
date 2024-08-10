package com.example.adaptadores.controllers;

import java.util.List;

import com.example.aplicacao.casosDeUso.CadastraCarroUC;
import com.example.aplicacao.casosDeUso.CadastraCorridaUC;
import com.example.aplicacao.casosDeUso.CadastraPilotoUC;
import com.example.aplicacao.casosDeUso.ConsultaCarrosUC;
import com.example.aplicacao.casosDeUso.ConsultaCorridasUC;
import com.example.aplicacao.casosDeUso.ConsultaPilotosUC;
import com.example.negocio.entidades.Carro;
import com.example.negocio.entidades.Corrida;
import com.example.negocio.entidades.Piloto;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Corridas")
public class CorridasController {
    private ConsultaCarrosUC consultaCarrosUC;
    private CadastraCarroUC cadastraCarroUC;
    private ConsultaPilotosUC consultaPilotosUC;
    private CadastraPilotoUC cadastraPilotoUC;
    private ConsultaCorridasUC consultaCorridasUC;
    private CadastraCorridaUC cadastraCorridaUC;

    public CorridasController(ConsultaCarrosUC consultaCarrosUC, CadastraCarroUC cadastraCarroUC,
            ConsultaPilotosUC consultaPilotosUC, CadastraPilotoUC cadastraPilotoUC,
            ConsultaCorridasUC consultaCorridasUC, CadastraCorridaUC cadastraCorridaUC) {

        this.consultaCarrosUC = consultaCarrosUC;
        this.cadastraCarroUC = cadastraCarroUC;
        this.consultaPilotosUC = consultaPilotosUC;
        this.cadastraPilotoUC = cadastraPilotoUC;
        this.consultaCorridasUC = consultaCorridasUC;
        this.cadastraCorridaUC = cadastraCorridaUC;

    }

    @GetMapping("/piloto")
    @CrossOrigin(origins = "*")
    public List<Piloto> consultaPiloto() {
        return consultaPilotosUC.run();
    }

    @PostMapping("/piloto")
    @CrossOrigin(origins = "*")
    public boolean cadastraPiloto(@RequestBody final Piloto piloto) {
        cadastraPilotoUC.run(piloto);
        return true;
    }

    @GetMapping("/carro")
    @CrossOrigin(origins = "*")
    public List<Carro> consultaCarro() {
        return consultaCarrosUC.run();
    }

    @PostMapping("/carro")
    @CrossOrigin(origins = "*")
    public boolean cadastraCarro(@RequestBody final Carro carro) {
        cadastraCarroUC.run(carro);
        return true;
    }

    @GetMapping("/corrida")
    @CrossOrigin(origins = "*")
    public List<Corrida> consultaCorridas() {
        return consultaCorridasUC.run();
    }

    @PostMapping("/corrida")
    @CrossOrigin(origins = "*")
    public boolean informaCorrida(@RequestParam String placa, @RequestBody final Corrida corrida) {
        cadastraCorridaUC.run(placa, corrida);
        return true;
    }

}

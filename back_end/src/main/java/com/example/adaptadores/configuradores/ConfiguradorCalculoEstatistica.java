// package com.example.adaptadores.configuradores;

// import com.example.aplicacao.servicos.EstatisticaDesconsidera;
// import com.example.aplicacao.servicos.EstatisticaNormal;
// import com.example.aplicacao.servicos.ICalculoEstatistica;
// import com.example.negocio.repositorios.ICorridaRepository;

// //import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class ConfiguradorCalculoEstatistica {
//     private ICorridaRepository eventoRep;

//     //@Autowired
//     public ConfiguradorCalculoEstatistica(ICorridaRepository eventoRep) {
//         this.eventoRep = eventoRep;
//     }

//     @Bean
//     @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "original", matchIfMissing = true)
//     public ICalculoEstatistica opcaoRegraClassica() {
//         return new EstatisticaNormal(eventoRep);
//     }

//     @Bean
//     @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "desconsidera")
//     public ICalculoEstatistica opcaoDesconsidera() {
//         return new EstatisticaDesconsidera(eventoRep);
//     }
// }

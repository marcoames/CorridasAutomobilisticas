package com.example.negocio.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String nacionalidade;

    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL)
    private List<Carro> carros;

    // @ManyToMany
    // @JoinTable(
    //     name = "corrida_piloto",
    //     joinColumns = @JoinColumn(name = "piloto_id"),
    //     inverseJoinColumns = @JoinColumn(name = "corrida_id")
    // )
    // private List<Corrida> corridas;

    public Piloto() {}

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    // public List<Corrida> getCorridas() {
    //     return corridas;
    // }

    // public void setCorridas(List<Corrida> corridas) {
    //     this.corridas = corridas;
    // }
}

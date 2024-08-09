package com.example.negocio.entidades;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Corrida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;
    private String local;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "corrida_piloto",
            joinColumns = @JoinColumn(name = "corrida_id"),
            inverseJoinColumns = @JoinColumn(name = "piloto_id")
    )
    private List<Piloto> pilotos;

    public Corrida() {}

    public Corrida(LocalDate data, String local, List<Piloto> pilotos) {
        this.data = data;
        this.local = local;
        this.pilotos = pilotos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }
}

package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "periodicidades")
public class PeriodicidadeModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, length = 2)
    private int id;
    @Column(length = 40)
    private String titulo;
    @Column(length = 15)
    private String titulo_abreviado;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo_abreviado() {
        return titulo_abreviado;
    }

    public void setTitulo_abreviado(String titulo_abreviado) {
        this.titulo_abreviado = titulo_abreviado;
    }
}
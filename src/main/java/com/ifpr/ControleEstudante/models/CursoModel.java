package com.ifpr.ControleEstudante.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class CursoModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(length = 80)
    private String nome;
    @Column(length = 10)
    private String nome_abreviado;
    @Column
    private int duracao_anos;
    @ManyToOne
    @JoinColumn(name = "periodicidade_id")
    private PeriodicidadeModel periodicidadeModel;
    @ManyToOne
    @JoinColumn(name = "grau_id")
    private GrauModel grauModel;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_abreviado() {
        return nome_abreviado;
    }

    public void setNome_abreviado(String nome_abreviado) {
        this.nome_abreviado = nome_abreviado;
    }

    public int getDuracao_anos() {
        return duracao_anos;
    }

    public void setDuracao_anos(int duracao_anos) {
        this.duracao_anos = duracao_anos;
    }

    public PeriodicidadeModel getPeriodicidadeModel() {
        return periodicidadeModel;
    }

    public void setPeriodicidadeModel(PeriodicidadeModel periodicidadeModel) {
        this.periodicidadeModel = periodicidadeModel;
    }

    public GrauModel getGrauModel() {
        return grauModel;
    }

    public void setGrauModel(GrauModel grauModel) {
        this.grauModel = grauModel;
    }


}
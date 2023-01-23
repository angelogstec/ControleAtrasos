package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Cursos")
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
    @OneToOne
    @JoinColumn(name = "periodicidade_model")
    private PeriodicidadeModel periodicidadeModel;
    @OneToOne
    @JoinColumn(name = "grau_model")
    private GrauModel grauModel;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

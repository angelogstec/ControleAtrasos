package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Year;

@Entity
@Table(name = "Turmas")
public class TurmaModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(length = 1)
    private String grupo;
    @Column
    private Year ano_inicio;
    @Column(length = 2)
    private int periodo_atual;
    @OneToOne
    @JoinColumn(name = "curso_model")
    private CursoModel cursoModel;
    @OneToOne
    @JoinColumn(name = "turno_model")
    private TurnoModel turnoModel;
}

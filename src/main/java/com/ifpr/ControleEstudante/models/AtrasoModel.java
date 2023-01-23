package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Atrasos")
public class AtrasoModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(length = 80)
    private String descricao;
    private Date data_horario;
    @OneToOne
    @JoinColumn(name = "aluno_model")
    private AlunoModel alunoModel;
}

package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Alunos")
public class AlunoModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "num_matricula", nullable = false, length = 11)
    private String num_matricula;
    @Column(length = 100)
    private String nome;
    @Column(length = 15)
    private String cpf;
    @Column(length = 20)
    private String rg;
    private Date data_nascimento;
    @Column(length = 100)
    private String url_foto;
    @OneToOne
    @JoinColumn(name = "turma_model")
    private TurmaModel turmaModel;
}

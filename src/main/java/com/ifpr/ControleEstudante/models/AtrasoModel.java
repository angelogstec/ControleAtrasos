package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "atrasos")
public class AtrasoModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(length = 80)
    private String descricao;
    @Column
    private Date data_horario;
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private AlunoModel alunoModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_horario() {
        return data_horario;
    }

    public void setData_horario(Date data_horario) {
        this.data_horario = data_horario;
    }

    public AlunoModel getAlunoModel() {
        return alunoModel;
    }

    public void setAlunoModel(AlunoModel alunoModel) {
        this.alunoModel = alunoModel;
    }
}

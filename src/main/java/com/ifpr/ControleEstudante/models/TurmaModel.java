package com.ifpr.ControleEstudante.models;

import java.io.Serial;
import java.io.Serializable;
import java.time.Year;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "turmas")
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
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoModel cursoModel;
    @ManyToOne
    @JoinColumn(name = "turno_id")
    private TurnoModel turnoModel;
    @OneToMany(mappedBy = "turmaModel")
    private List<AlunoModel> alunos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Year getAno_inicio() {
        return ano_inicio;
    }

    public void setAno_inicio(Year ano_inicio) {
        this.ano_inicio = ano_inicio;
    }

    public int getPeriodo_atual() {
        return periodo_atual;
    }

    public void setPeriodo_atual(int periodo_atual) {
        this.periodo_atual = periodo_atual;
    }

    public CursoModel getCursoModel() {
        return cursoModel;
    }

    public void setCursoModel(CursoModel cursoModel) {
        this.cursoModel = cursoModel;
    }

    public TurnoModel getTurnoModel() {
        return turnoModel;
    }

    public void setTurnoModel(TurnoModel turnoModel) {
        this.turnoModel = turnoModel;
    }

    public List<AlunoModel> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoModel> alunos) {
        this.alunos = alunos;
    }
}

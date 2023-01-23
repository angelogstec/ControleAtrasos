package com.ifpr.ControleEstudante.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "alunos")
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
    @ManyToOne
    @JoinColumn(name = "turma_id")
    private TurmaModel turmaModel;

    public String getNum_matricula() {
        return num_matricula;
    }

    public void setNum_matricula(String num_matricula) {
        this.num_matricula = num_matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public TurmaModel getTurmaModel() {
        return turmaModel;
    }

    public void setTurmaModel(TurmaModel turmaModel) {
        this.turmaModel = turmaModel;
    }
}

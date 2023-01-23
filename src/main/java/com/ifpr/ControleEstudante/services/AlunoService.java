package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.AlunoModel;
import com.ifpr.ControleEstudante.repositories.AlunoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }

    public Optional<AlunoModel> findById(String num_matricula) {
        return alunoRepository.findById(num_matricula);
    }

    public AlunoModel save(AlunoModel aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteById(String num_matricula) {
        alunoRepository.deleteById(num_matricula);
    }
}

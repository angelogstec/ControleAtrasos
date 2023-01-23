package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.CursoModel;
import com.ifpr.ControleEstudante.models.TurmaModel;
import com.ifpr.ControleEstudante.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository turmaRepository;
    public List<TurmaModel> findAll() {
        return turmaRepository.findAll();
    }

    public Optional<TurmaModel> findById(int id) {
        return turmaRepository.findById(id);
    }

    public TurmaModel save(TurmaModel turma) {
        return turmaRepository.save(turma);
    }

    public void deleteById(int id) {
        turmaRepository.deleteById(id);
    }
}

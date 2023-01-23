package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.CursoModel;
import com.ifpr.ControleEstudante.models.PeriodicidadeModel;
import com.ifpr.ControleEstudante.repositories.PeriodicidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeriodicidadeService {
    @Autowired
    private PeriodicidadeRepository periodicidadeRepository;
    public List<PeriodicidadeModel> findAll() {
        return periodicidadeRepository.findAll();
    }

    public Optional<PeriodicidadeModel> findById(int id) {
        return periodicidadeRepository.findById(id);
    }

    public PeriodicidadeModel save(PeriodicidadeModel periocicidade) {
        return periodicidadeRepository.save(periocicidade);
    }

    public void deleteById(int id) {
        periodicidadeRepository.deleteById(id);
    }
}

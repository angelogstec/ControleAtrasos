package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.CursoModel;
import com.ifpr.ControleEstudante.models.TurnoModel;
import com.ifpr.ControleEstudante.repositories.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;
    public List<TurnoModel> findAll() {
        return turnoRepository.findAll();
    }

    public Optional<TurnoModel> findById(int id) {
        return turnoRepository.findById(id);
    }

    public TurnoModel save(TurnoModel turno) {
        return turnoRepository.save(turno);
    }

    public void deleteById(int id) {
        turnoRepository.deleteById(id);
    }
}

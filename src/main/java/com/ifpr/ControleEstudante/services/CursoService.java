package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.AtrasoModel;
import com.ifpr.ControleEstudante.models.CursoModel;
import com.ifpr.ControleEstudante.repositories.AtrasoRepository;
import com.ifpr.ControleEstudante.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoModel> findAll() {
        return cursoRepository.findAll();
    }

    public Optional<CursoModel> findById(int id) {
        return cursoRepository.findById(id);
    }

    public CursoModel save(CursoModel curso) {
        return cursoRepository.save(curso);
    }

    public void deleteById(int id) {
        cursoRepository.deleteById(id);
    }
}

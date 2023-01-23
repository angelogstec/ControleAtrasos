package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.CursoModel;
import com.ifpr.ControleEstudante.models.GrauModel;
import com.ifpr.ControleEstudante.repositories.GrauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrauService {
    @Autowired
    private GrauRepository grauRepository;

    public List<GrauModel> findAll() {
        return grauRepository.findAll();
    }

    public Optional<GrauModel> findById(int id) {
        return grauRepository.findById(id);
    }

    public GrauModel save(GrauModel grau) {
        return grauRepository.save(grau);
    }

    public void deleteById(int id) {
        grauRepository.deleteById(id);
    }
}

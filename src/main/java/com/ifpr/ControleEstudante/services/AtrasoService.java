package com.ifpr.ControleEstudante.services;

import com.ifpr.ControleEstudante.models.AtrasoModel;
import com.ifpr.ControleEstudante.repositories.AtrasoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AtrasoService {
    @Autowired

    private AtrasoRepository atrasoRepository;

    public List<AtrasoModel> findAll() {
        return atrasoRepository.findAll();
    }

    public Optional<AtrasoModel> findById(int id) {
        return atrasoRepository.findById(id);
    }

    public AtrasoModel save(AtrasoModel atraso) {
        return atrasoRepository.save(atraso);
    }

    public void deleteById(int id) {
        atrasoRepository.deleteById(id);
    }
}

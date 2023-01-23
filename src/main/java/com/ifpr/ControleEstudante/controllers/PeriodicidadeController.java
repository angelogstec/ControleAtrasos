package com.ifpr.ControleEstudante.controllers;

import com.ifpr.ControleEstudante.models.PeriodicidadeModel;
import com.ifpr.ControleEstudante.services.PeriodicidadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/periodicidades")
public class PeriodicidadeController {
    @Autowired
    private PeriodicidadeService periodicidadeService;

    @GetMapping
    public List<PeriodicidadeModel> getAllPeriodicidades() {
        return periodicidadeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<PeriodicidadeModel> getPeriodicidadeById(@PathVariable int id) {
        return periodicidadeService.findById(id);
    }

    @PostMapping
    public PeriodicidadeModel addPeriodicidade(@Valid @RequestBody PeriodicidadeModel periodicidade) {
        return periodicidadeService.save(periodicidade);
    }

    @PutMapping("/{id}")
    public PeriodicidadeModel updatePeriodicidade(@PathVariable int id, @Valid @RequestBody PeriodicidadeModel periodicidade) {
        periodicidade.setId(id);
        return periodicidadeService.save(periodicidade);
    }

    @DeleteMapping("/{id}")
    public void deletePeriodicidade(@PathVariable int id) {
        periodicidadeService.deleteById(id);
    }
}

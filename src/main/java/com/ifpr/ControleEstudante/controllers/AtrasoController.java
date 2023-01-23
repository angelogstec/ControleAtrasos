package com.ifpr.ControleEstudante.controllers;

import com.ifpr.ControleEstudante.models.AtrasoModel;
import com.ifpr.ControleEstudante.services.AtrasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atrasos")
public class AtrasoController {
    @Autowired
    private AtrasoService atrasoService;

    @GetMapping
    public List<AtrasoModel> getAllAtrasos() {
        return atrasoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AtrasoModel> getAtrasoById(@PathVariable int id) {
        return atrasoService.findById(id);
    }

    @PostMapping
    public AtrasoModel addAtraso(@Valid @RequestBody AtrasoModel atraso) {
        return atrasoService.save(atraso);
    }

    @PutMapping("/{id}")
    public AtrasoModel updateAtraso(@PathVariable int id, @Valid @RequestBody AtrasoModel atraso) {
        atraso.setId(id);
        return atrasoService.save(atraso);
    }

    @DeleteMapping("/{id}")
    public void deleteAtraso(@PathVariable int id) {
        atrasoService.deleteById(id);
    }
}

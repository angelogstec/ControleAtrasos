package com.ifpr.ControleEstudante.controllers;

import com.ifpr.ControleEstudante.models.CursoModel;
import com.ifpr.ControleEstudante.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;


    @GetMapping
    public List<CursoModel> getAllCursos() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CursoModel> getCursoById(@PathVariable int id) {
        return cursoService.findById(id);
    }

    @PostMapping
    public CursoModel addCurso(@Valid @RequestBody CursoModel curso) {
        return cursoService.save(curso);
    }

    @PutMapping("/{id}")
    public CursoModel updateCurso(@PathVariable int id, @Valid @RequestBody CursoModel curso) {
        curso.setId(id);
        return cursoService.save(curso);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable int id) {
        cursoService.deleteById(id);
    }
}

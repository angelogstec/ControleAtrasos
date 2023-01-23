package com.ifpr.ControleEstudante.controllers;

import com.ifpr.ControleEstudante.models.GrauModel;
import com.ifpr.ControleEstudante.services.GrauService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/graus")
public class GrauController {
    @Autowired

        private GrauService grauService;
        @GetMapping
        public List<GrauModel> getAllGraus() {
            return grauService.findAll();
        }

        @GetMapping("/{id}")
        public Optional<GrauModel> getGrauById(@PathVariable int id) {
            return grauService.findById(id);
        }

        @PostMapping
        public GrauModel addGrau(@Valid @RequestBody GrauModel grau) {
            return grauService.save(grau);
        }

        @PutMapping("/{id}")
        public GrauModel updateGrau(@PathVariable int id, @Valid @RequestBody GrauModel grau) {
            grau.setId(id);
            return grauService.save(grau);
        }

        @DeleteMapping("/{id}")
        public void deleteGrau(@PathVariable int id) {
            grauService.deleteById(id);
        }

}

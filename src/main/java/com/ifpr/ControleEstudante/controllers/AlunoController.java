package com.ifpr.ControleEstudante.controllers;

import com.ifpr.ControleEstudante.models.AlunoModel;
import com.ifpr.ControleEstudante.models.TurmaModel;
import com.ifpr.ControleEstudante.repositories.AlunoRepository;
import com.ifpr.ControleEstudante.repositories.TurmaRepository;
import com.ifpr.ControleEstudante.services.AlunoService;
import com.ifpr.ControleEstudante.services.TurmaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<AlunoModel> getAllAlunos() {
        return alunoService.findAll();
    }

    @PostMapping
    public AlunoModel addAluno(@Valid @RequestBody AlunoModel aluno) {
        Optional<TurmaModel> turma = turmaService.findById(aluno.getTurmaModel().getId());
        aluno.setTurmaModel(turma.get());
        return alunoService.save(aluno);
    }

    @GetMapping("/{id}")
    public Optional<AlunoModel> getAlunoById(@PathVariable(value = "id") String num_matricula) {
        return alunoService.findById(num_matricula);
    }

    @PutMapping("/{id}")
    public AlunoModel updateAluno(@PathVariable(value = "id") String num_matricula,
                                  @Valid @RequestBody AlunoModel alunoDetails) {
        Optional<AlunoModel> aluno = alunoService.findById(num_matricula);
        Optional<TurmaModel> turma = turmaService.findById(alunoDetails.getTurmaModel().getId());

        AlunoModel alunoModel = aluno.get();
        alunoModel.setNome(alunoDetails.getNome());
        alunoModel.setCpf(alunoDetails.getCpf());
        alunoModel.setRg(alunoDetails.getRg());
        alunoModel.setData_nascimento(alunoDetails.getData_nascimento());
        alunoModel.setUrl_foto(alunoDetails.getUrl_foto());
        alunoModel.setTurmaModel(turma.get());

        return alunoService.save(alunoModel);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable(value = "id") String num_matricula) {
        alunoService.deleteById(num_matricula);
    }
}

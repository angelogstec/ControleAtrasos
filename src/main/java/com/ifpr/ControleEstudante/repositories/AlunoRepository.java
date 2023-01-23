package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, String> {
}

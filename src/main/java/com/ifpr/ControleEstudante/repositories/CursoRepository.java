package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<CursoModel, Integer> {
}

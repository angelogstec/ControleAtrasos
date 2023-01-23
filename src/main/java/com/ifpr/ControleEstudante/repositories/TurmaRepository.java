package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.TurmaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository  extends JpaRepository<TurmaModel, Integer> {
}

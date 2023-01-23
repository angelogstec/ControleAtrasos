package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.TurnoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository  extends JpaRepository<TurnoModel, Integer> {
}

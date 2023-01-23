package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.PeriodicidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodicidadeRepository  extends JpaRepository<PeriodicidadeModel, Integer> {
}

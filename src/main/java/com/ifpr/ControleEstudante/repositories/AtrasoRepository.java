package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.AtrasoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtrasoRepository  extends JpaRepository<AtrasoModel, Integer> {
}

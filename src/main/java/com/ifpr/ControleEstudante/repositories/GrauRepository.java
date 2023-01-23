package com.ifpr.ControleEstudante.repositories;

import com.ifpr.ControleEstudante.models.GrauModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrauRepository  extends JpaRepository<GrauModel, Integer> {
}

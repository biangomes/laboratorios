package com.example.poc.repository;

import com.example.poc.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
  List<Profissional> findByNome(String nome);
}

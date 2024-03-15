package com.example.poc.repository;

import com.example.poc.model.Conselho;
import com.example.poc.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConselhoRepository extends JpaRepository<Conselho, Long> {
  Conselho findByNome(String nome);
}

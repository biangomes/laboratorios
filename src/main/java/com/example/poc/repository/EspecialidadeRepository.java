package com.example.poc.repository;

import com.example.poc.model.Especialidade;
import com.example.poc.model.dto.EspecialidadeConselhoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
  @Query("SELECT e FROM Especialidade e WHERE e.conselho = :conselhoId")
  Optional<List<EspecialidadeConselhoDto>> consultaPorConselho(Long conselhoId);
}

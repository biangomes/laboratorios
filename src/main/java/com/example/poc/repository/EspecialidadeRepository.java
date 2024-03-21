package com.example.poc.repository;

import com.example.poc.model.Especialidade;
import com.example.poc.model.dto.EspecialidadeConselhoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
  @Query(value = "SELECT * FROM especialidade e JOIN conselho c on e.conselho_id = c.id WHERE c.id = :conselhoId",
          nativeQuery = true)
  Optional<List<Especialidade>> consultaPorConselho(Long conselhoId);

  @Query(value = "SELECT e.* FROM especialidade e JOIN conselho c ON e.conselho_id = c.id WHERE c.id = :conselhoId",
        nativeQuery = true)
  List<EspecialidadeConselhoDto> consultaPorConselhoDto(@Param("conselhoId") Long conselhoId);
}
                
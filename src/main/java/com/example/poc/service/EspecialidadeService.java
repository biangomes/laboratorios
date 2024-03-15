package com.example.poc.service;

import com.example.poc.model.Especialidade;
import com.example.poc.model.dto.EspecialidadeConselhoDto;
import com.example.poc.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadeService {
  private EspecialidadeRepository repository;

  @Autowired
  public EspecialidadeService(final EspecialidadeRepository repository) {
    this.repository = repository;
  }

  public List<EspecialidadeConselhoDto> getEspecialidadePorConselho(Long conselhoId) {
    Optional<List<EspecialidadeConselhoDto>> resultado = repository.consultaPorConselho(conselhoId);
    if (resultado.isEmpty()) {
      throw new IllegalArgumentException("Não existem especialidades pertencentes a este convênio");
    }
    return resultado.get();
  }
}

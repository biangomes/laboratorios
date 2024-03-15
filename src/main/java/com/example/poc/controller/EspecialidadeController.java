package com.example.poc.controller;

import com.example.poc.model.Especialidade;
import com.example.poc.model.dto.EspecialidadeConselhoDto;
import com.example.poc.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/especialidade")
public class EspecialidadeController {
  private EspecialidadeService service;

  @Autowired
  public EspecialidadeController(final EspecialidadeService service) {
    this.service = service;
  }

  @GetMapping("/{conselhoId}")
  public ResponseEntity<List<EspecialidadeConselhoDto>> especialidadesDeUmConselho(@PathVariable Long conselhoId) {
    List<EspecialidadeConselhoDto> resultado = service.getEspecialidadePorConselho(conselhoId);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }
}

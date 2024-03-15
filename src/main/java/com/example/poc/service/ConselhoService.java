package com.example.poc.service;

import com.example.poc.model.Conselho;
import com.example.poc.repository.ConselhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConselhoService {
  private ConselhoRepository repository;

  @Autowired
  public ConselhoService(final ConselhoRepository repository) {
    this.repository = repository;
  }

  public Conselho getByNome(String nome) {
    return repository.findByNome(nome);
  }
}

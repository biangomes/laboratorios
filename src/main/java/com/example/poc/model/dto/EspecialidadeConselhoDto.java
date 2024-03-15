package com.example.poc.model.dto;

import com.example.poc.model.Conselho;
import com.example.poc.model.Especialidade;
import lombok.*;

@Getter
@Setter
@Data
public class EspecialidadeConselhoDto {
  private Especialidade especialidade;
  private Conselho conselho;
}

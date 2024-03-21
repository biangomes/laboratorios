package com.example.poc.model.dto;

import com.example.poc.model.Conselho;
import com.example.poc.model.Especialidade;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
public class EspecialidadeConselhoDto implements Serializable {
  private Especialidade especialidade;
  private Conselho conselho;
}

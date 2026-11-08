package com.wgladson.devtrack.Aplicacao.DTOs;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public record ProjetoDTO(Long idProjeto ,
                         String nomeProjeto,
                         String codinome,
                         String referencia,
                         LocalDate prazo,
                         Long idStatus,
                         Short prioridade,
                         String descricao,
                         Long gerenteTec,
                         Long criadoPor,
                         OffsetDateTime criadoEm,
                         OffsetDateTime atualizadoEm,
                         OffsetDateTime finalizadoEm,
                         String areaDepartamento,
                         String equipe,
                         Long gerenteOp){
}

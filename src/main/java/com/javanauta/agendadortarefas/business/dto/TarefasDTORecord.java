package com.javanauta.agendadortarefas.business.dto;

import com.javanauta.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;

import java.time.LocalDateTime;

public record TarefasDTORecord(String id,
                               String nomeTarefa,
                               String descricao,
                               //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY HH:mm:ss")
                               LocalDateTime dataCriacao,
                               //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY HH:mm:ss")
                               LocalDateTime dataEvento,
                               String emailUsuario,
                               //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY HH:mm:ss")
                               LocalDateTime dataAlteracao,
                               StatusNotificacaoEnum statusNotificacaoEnum) {
}

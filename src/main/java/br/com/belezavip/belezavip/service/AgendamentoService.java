package br.com.belezavip.belezavip.service;

import br.com.belezavip.belezavip.entity.Agendamento;

import java.util.List;

public interface AgendamentoService {

    Agendamento cadastrar(Agendamento agendamento);

    List<Agendamento> listar();
}

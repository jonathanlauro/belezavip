package br.com.belezavip.belezavip.controller;

import br.com.belezavip.belezavip.domain.dto.AgendamentoDTO;
import br.com.belezavip.belezavip.domain.dto.AgendamentoResponseDTO;
import br.com.belezavip.belezavip.domain.mapper.AgendamentoMapper;
import br.com.belezavip.belezavip.entity.Agendamento;
import br.com.belezavip.belezavip.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoController {

    @Autowired
    AgendamentoMapper mapper;

    @Autowired
    AgendamentoService agendamentoService;

    @PostMapping
    Agendamento cadastrar(@RequestBody AgendamentoDTO agendamentoDTO) throws ParseException {
        return agendamentoService.cadastrar(mapper.toEntidade(agendamentoDTO));
    }

    @GetMapping
    List<AgendamentoResponseDTO> listar(){
        return mapper.toListModels(agendamentoService.listar());
    }
}

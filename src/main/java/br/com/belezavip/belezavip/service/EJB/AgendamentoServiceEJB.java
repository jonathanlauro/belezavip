package br.com.belezavip.belezavip.service.EJB;

import br.com.belezavip.belezavip.entity.Agendamento;
import br.com.belezavip.belezavip.repository.AgendamentoRepository;
import br.com.belezavip.belezavip.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoServiceEJB implements AgendamentoService {

    @Autowired
    AgendamentoRepository repository;

    @Override
    public Agendamento cadastrar(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    @Override
    public List<Agendamento> listar() {
        return repository.findAll();
    }
}

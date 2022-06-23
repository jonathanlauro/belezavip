package br.com.belezavip.belezavip.repository;

import br.com.belezavip.belezavip.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Integer> {

    Agendamento findById(int id);
}

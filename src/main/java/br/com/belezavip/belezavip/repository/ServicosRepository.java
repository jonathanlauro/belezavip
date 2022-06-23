package br.com.belezavip.belezavip.repository;

import br.com.belezavip.belezavip.entity.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicosRepository extends JpaRepository<Servicos,Integer> {

    Servicos findById(int id);
}

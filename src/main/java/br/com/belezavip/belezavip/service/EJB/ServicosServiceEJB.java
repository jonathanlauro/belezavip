package br.com.belezavip.belezavip.service.EJB;

import br.com.belezavip.belezavip.entity.Servicos;
import br.com.belezavip.belezavip.repository.ServicosRepository;
import br.com.belezavip.belezavip.service.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosServiceEJB implements ServicosService {

    @Autowired
    ServicosRepository repository;

    @Override
    public Servicos cadastrar(Servicos servicos) {
        return repository.save(servicos);
    }

    @Override
    public List<Servicos> listar() {
        return repository.findAll();
    }

    @Override
    public Servicos buscarPorId(int id){
        return repository.findById(id);
    }
}

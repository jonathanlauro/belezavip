package br.com.belezavip.belezavip.service;

import br.com.belezavip.belezavip.entity.Servicos;

import java.util.List;

public interface ServicosService {

    Servicos cadastrar(Servicos servicos);

    List<Servicos> listar();

    public Servicos buscarPorId(int id);
}

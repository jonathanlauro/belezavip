package br.com.belezavip.belezavip.controller;

import br.com.belezavip.belezavip.entity.Servicos;
import br.com.belezavip.belezavip.service.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/servico")
public class ServicosController {

    @Autowired
    ServicosService servicosService;

    @GetMapping
    List<Servicos> listarServicos(){
        return servicosService.listar();
    }
}

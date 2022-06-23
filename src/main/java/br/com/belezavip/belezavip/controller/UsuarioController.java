package br.com.belezavip.belezavip.controller;

import br.com.belezavip.belezavip.domain.dto.LoginDTO;
import br.com.belezavip.belezavip.domain.dto.UsuarioDTO;
import br.com.belezavip.belezavip.domain.mapper.UsuarioMapper;
import br.com.belezavip.belezavip.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @Autowired
    UsuarioMapper mapper;


    @GetMapping
    List<UsuarioDTO> buscarUsuarios(){
        return mapper.toListModel(service.listar());
    }

    @PostMapping
    UsuarioDTO cadastrar(@RequestBody UsuarioDTO usuarioDTO) {
        return mapper.toModel(service.cadastrar(mapper.toEntidade(usuarioDTO)));
    }
    @PostMapping("/login")
    Boolean login(@RequestBody LoginDTO login){
        return service.login(login.getEmail(),login.getSenha());
    }
}

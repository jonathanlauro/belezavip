package br.com.belezavip.belezavip.service;

import br.com.belezavip.belezavip.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario findById(int id);

    Boolean login(String email,String senha);

    Usuario cadastrar(Usuario usuario);

    List<Usuario> listar();
}

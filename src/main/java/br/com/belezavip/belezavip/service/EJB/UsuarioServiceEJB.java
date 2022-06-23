package br.com.belezavip.belezavip.service.EJB;

import br.com.belezavip.belezavip.entity.Usuario;
import br.com.belezavip.belezavip.repository.UsuarioRepository;
import br.com.belezavip.belezavip.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.isNull;

@Service
public class UsuarioServiceEJB implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public Usuario findById(int id) {
        Usuario usuario = repository.findById(id);
        return usuario;
    }

    @Override
    public Boolean login(String email, String senha) {
        Usuario retorno = repository.findByEmail(email.trim());
        if(isNull(retorno)){
            return false;
        }else return retorno.getSenha().equals(senha.trim());

    }

    @Override
    public Usuario cadastrar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return repository.findAll();
    }
}

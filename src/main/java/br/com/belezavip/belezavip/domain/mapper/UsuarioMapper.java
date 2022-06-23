package br.com.belezavip.belezavip.domain.mapper;

import br.com.belezavip.belezavip.domain.dto.UsuarioDTO;
import br.com.belezavip.belezavip.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioMapper implements Mapper<Usuario, UsuarioDTO>{

    @Override
    public UsuarioDTO toModel(Usuario entidade) {
        return new UsuarioDTO(
                entidade.getId(),
                entidade.getNome(),
                entidade.getEndereco(),
                entidade.getTelefone(),
                entidade.getCpf(),
                entidade.getEmail(),
                null);
    }

    @Override
    public Usuario toEntidade(UsuarioDTO model) {
        return new Usuario(
                model.getId(),
                model.getNome(),
                model.getEndereco(),
                model.getTelefone(),
                model.getCpf(),
                model.getEmail(),
                model.getSenha());
    }

    @Override
    public List<UsuarioDTO> toListModel(List<Usuario> entidades) {
        List<UsuarioDTO> lista = new ArrayList<>();
        entidades.forEach(entidade -> {
            lista.add(new UsuarioDTO(
                    entidade.getId(),
                    entidade.getNome(),
                    entidade.getEndereco(),
                    entidade.getTelefone(),
                    entidade.getCpf(),
                    entidade.getEmail(),
                    null));
        });
        return lista;
    }

    @Override
    public List<Usuario> toListEntidade(List<UsuarioDTO> models) {
        List<Usuario> lista = new ArrayList<>();
        models.forEach(model -> {
            lista.add(new Usuario(
                    model.getId(),
                    model.getNome(),
                    model.getEndereco(),
                    model.getTelefone(),
                    model.getCpf(),
                    model.getEmail(),
                    model.getSenha()));
        });
        return lista;
    }
}

package br.com.belezavip.belezavip.repository;

import br.com.belezavip.belezavip.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    Usuario findByEmail(String email);

    Usuario findById(int id);
}

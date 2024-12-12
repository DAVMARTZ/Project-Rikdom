package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Usuario;
import java.util.Optional;

public interface IUsuarioJpa extends JpaRepository<Usuario, Integer>  {
	Usuario findByUsuCorreo(String usuCorreo);

    public Optional<Usuario> findById(Long id);

    public void deleteById(Long id);
}

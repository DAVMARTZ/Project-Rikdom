package co.edu.ue.service;

import co.edu.ue.entity.Usuario;
import co.edu.ue.jpa.IUsuarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import co.edu.ue.jpa.IUsuarioJpa;

@Service
public class UsuarioService implements IUsuarioService {

    private final IUsuarioJpa usuarioJpa;

    @Autowired
    public UsuarioService(IUsuarioJpa usuarioJpa) {
        this.usuarioJpa = usuarioJpa;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioJpa.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioJpa.findById(id);
        return usuario.orElse(null); // Retorna null si no encuentra el usuario
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioJpa.findAll();
    }

    @Override
    public void deleteById(Long id) {
        usuarioJpa.deleteById(id);
    }
}

package co.edu.ue.service;

import co.edu.ue.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    Usuario save(Usuario usuario); // Crear o actualizar un usuario
    Usuario findById(Long id); // Buscar usuario por ID
    List<Usuario> findAll(); // Obtener todos los usuarios
    void deleteById(Long id); // Eliminar usuario por ID
}

package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Usuario;
import co.edu.ue.jpa.IUsuarioJpa;

@Repository
public class UsuarioDao implements IUsuarioDao {

	@Autowired
	IUsuarioJpa jpa;
	
	@Override
	public List<Usuario> GuardarUser(Usuario usuario) {
		jpa.save(usuario);
		return listaCompleta();
	}

	@Override
	public Usuario ActualizarDato(Usuario usuario) {
		return jpa.save(usuario);
	}

	@Override
	public List<Usuario> listaCompleta() {
		return jpa.findAll();
	}

	@Override
	public Usuario BuscarID(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Usuario BuscarEmail(String Correo) {
		return jpa.findByUsuCorreo(Correo);
	}

}

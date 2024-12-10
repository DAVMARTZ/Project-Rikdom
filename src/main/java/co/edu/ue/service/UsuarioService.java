package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IUsuarioDao;
import co.edu.ue.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	IUsuarioDao dao;
	
	@Override
	public List<Usuario> addUser(Usuario usuario) {
		// TODO Auto-generated method stub
		return dao.GuardarUser(usuario);
	}

	@Override
	public Usuario UpdateDato(Usuario usuario) {
		int usuId = usuario.getUsuId();
		if(FindID(usuId).equals(null)) {
			return dao.ActualizarUser(usuario);
		}
		return null;
	}

	@Override
	public List<Usuario> listAll() {
		// TODO Auto-generated method stub
		return dao.listaCompleta();
	}

	@Override
	public Usuario FindID(int id) {
		// TODO Auto-generated method stub
		return dao.BuscarID(id);
	}

	@Override
	public Usuario FindEmail(String Correo) {
		// TODO Auto-generated method stub
		return dao.BuscarEmail(Correo);
	}

}

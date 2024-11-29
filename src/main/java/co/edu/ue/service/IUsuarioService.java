package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioService {
	List<Usuario> addUser(Usuario usuario);
	Usuario UpdateDato(Usuario usuario);
	//Consulta
	List<Usuario> listAll();
	Usuario FindID(int id);
	Usuario FindEmail(String Correo);
}

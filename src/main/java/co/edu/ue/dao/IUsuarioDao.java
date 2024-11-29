package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioDao {
	//Declaracion
	List<Usuario> GuardarUser(Usuario usuario);
	Usuario ActualizarDato(Usuario usuario);
	//Consulta
	List<Usuario> listaCompleta();
	Usuario BuscarID(int id);
	Usuario BuscarEmail(String Correo);
}

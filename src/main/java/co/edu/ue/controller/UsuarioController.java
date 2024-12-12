package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class UsuarioController {

	@Autowired
	IUsuarioService service;

	@GetMapping(value = "Greeting/{name}")
	public String saludar(@PathVariable("name") String nombre) {
		return "Bienvenido a Rikdom su banco de confianza" + nombre;
	}

	@GetMapping(value = "User-sav")
	public List<Usuario> postUser(@RequestBody Usuario usuario) {
		return service.addUser(usuario);
	}

	@GetMapping(value = "User-all")
	public List<Usuario> getAll() {
		return service.listAll();
	}

	@PostMapping(value = "dato-sav", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> postDato(@RequestBody Usuario usuario) {
		List<Usuario> listUsuario = service.addUser(usuario);
		return new ResponseEntity<>(listUsuario, HttpStatus.CREATED);
	}
//Hola
}

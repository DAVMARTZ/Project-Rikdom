package co.edu.ue.controller;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ue.entity.Usuario;
import co.edu.ue.service.IUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UsuarioController {

	@Autowired
	IUsuarioService service;

	@GetMapping(value = "Greeting/{name}")
	public String saludar(@PathVariable("name") String nombre) {
		return "Bienvenido a Rikdom su banco de confianza" + nombre;
	}

	@PostMapping(value = "User-sav", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<Usuario>> postUser(@RequestBody Usuario usuario) {
		List<Usuario> listUser = service.addUser(usuario); 
		return new ResponseEntity<List<Usuario>>(listUser, HttpStatus.CREATED);
	}

	@GetMapping(value = "User-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> getAll() {
		List<Usuario> listUser = service.listAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("cantDatos", String.valueOf(listUser.size()));
		headers.add("Test", "Valor");
		return new ResponseEntity<List<Usuario>>(listUser, headers, HttpStatus.OK);
	}
	
	@PutMapping(value = "User-up")
	public ResponseEntity<Usuario> putUser(@RequestBody Usuario usuario) {
		return new ResponseEntity<Usuario>(service.UpdateDato(usuario),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value="User_id")
	public ResponseEntity<Usuario> getIdUser(@RequestParam("id") int id) {
		return new ResponseEntity<Usuario>(service.FindID(id), HttpStatus.OK);
	}
	
	@GetMapping(value="User_Email")
	public ResponseEntity<Usuario> getIdUser(@RequestParam("Correo") String Correo) {
		return new ResponseEntity<Usuario>(service.FindEmail(Correo), HttpStatus.ACCEPTED);
	}
}

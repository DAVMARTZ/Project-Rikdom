package co.edu.ue.service;

import co.edu.ue.entity.Cliente;
import java.util.List;

public interface IClienteService {
    List<Cliente> findAll();
    Cliente save(Cliente cliente);
	Cliente findById(Integer id);
	void delete(Integer id);
}

package co.edu.ue.controller;

import co.edu.ue.entity.Cliente;
import co.edu.ue.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente clienteExistente = clienteService.findById(id);
        if (clienteExistente != null) {
            cliente.setId(id); // Asegúrate de tener un campo `id` en `Cliente`.
            return clienteService.save(cliente);
        }
        return null; // Manejo de error simplificado.
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        clienteService.delete(id);
    }
}


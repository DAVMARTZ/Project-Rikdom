package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Cliente;
import co.edu.ue.jpa.IClienteJpa; // Asegúrate de que la interfaz tenga este nombre

@Repository
public class ClienteDao {

    @Autowired
    private IClienteJpa jpa; // Correcto, asegúrate de que esté correctamente inyectado

    // Método para guardar cliente
    public List<Cliente> guardarCliente(Cliente cliente) {
        jpa.save(cliente); // Guarda el cliente
        return listaCompleta(); // Retorna la lista completa de clientes
    }

    // Método para actualizar cliente
    public Cliente actualizarCliente(Cliente cliente) {
        return jpa.save(cliente); // Guarda el cliente y lo actualiza
    }

    // Obtener todos los clientes
    public List<Cliente> listaCompleta() {
        return jpa.findAll(); // Retorna todos los clientes
    }

    // Buscar un cliente por ID
    public Cliente buscarPorId(int id) {
        // Optional<Cliente> es retornado, así que usaremos orElse para obtener el valor o null
        return jpa.findById(id).orElse(null); 
    }
}

package co.edu.ue.dao;

import co.edu.ue.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Integer> {
    // Aquí puedes añadir métodos personalizados si los necesitas.
}

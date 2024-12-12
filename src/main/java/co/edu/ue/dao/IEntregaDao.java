package co.edu.ue.dao;

import co.edu.ue.entity.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntregaDao extends JpaRepository<Entrega, Integer> {
    // Métodos personalizados si los necesitas.
}

package co.edu.ue.dao;

import co.edu.ue.entity.Solicitude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitudeDao extends JpaRepository<Solicitude, Integer> {
    // Métodos personalizados si los necesitas.
}

package co.edu.ue.service;

import co.edu.ue.entity.Entrega;
import java.util.List;

public interface IEntregaService {
    List<Entrega> findAll();
    Entrega findById(Long id);
    Entrega save(Entrega entrega);
    void delete(Long id);
}

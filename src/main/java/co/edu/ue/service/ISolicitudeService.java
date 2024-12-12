package co.edu.ue.service;

import co.edu.ue.entity.Solicitude;
import java.util.List;

public interface ISolicitudeService {
    List<Solicitude> findAll();
    Solicitude findById(Long id);
    Solicitude save(Solicitude solicitude);
    void delete(Long id);
}

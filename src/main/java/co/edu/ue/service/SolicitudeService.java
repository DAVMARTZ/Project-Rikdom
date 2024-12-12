package co.edu.ue.service;

import co.edu.ue.dao.ISolicitudeDao;
import co.edu.ue.entity.Solicitude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudeService implements ISolicitudeService {

    @Autowired
    private ISolicitudeDao solicitudeDao;

    @Override
    public List<Solicitude> findAll() {
        return solicitudeDao.findAll();
    }

    @Override
    public Solicitude findById(Long id) {
        return solicitudeDao.findById(id).orElse(null);
    }

    @Override
    public Solicitude save(Solicitude solicitude) {
        return solicitudeDao.save(solicitude);
    }

    @Override
    public void delete(Long id) {
        solicitudeDao.deleteById(id);
    }
}

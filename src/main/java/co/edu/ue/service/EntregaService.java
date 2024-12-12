package co.edu.ue.service;

import co.edu.ue.dao.IEntregaDao;
import co.edu.ue.entity.Entrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService implements IEntregaService {

    @Autowired
    private IEntregaDao entregaDao;

    @Override
    public List<Entrega> findAll() {
        return entregaDao.findAll();
    }

    @Override
    public Entrega findById(Long id) {
        return entregaDao.findById(id).orElse(null);
    }

    @Override
    public Entrega save(Entrega entrega) {
        return entregaDao.save(entrega);
    }

    @Override
    public void delete(Long id) {
        entregaDao.deleteById(id);
    }
}

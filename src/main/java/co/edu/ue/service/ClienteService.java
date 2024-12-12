package co.edu.ue.service;

import co.edu.ue.dao.IClienteDao;
import co.edu.ue.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        clienteDao.deleteById(id);
    }
}

package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Entrega;
import co.edu.ue.jpa.IEntregaJpa;

@Repository
public class EntregaDao {

    @Autowired
    IEntregaJpa jpa;

    public List<Entrega> guardarEntrega(Entrega entrega) {
        jpa.save(entrega);
        return listaCompleta();
    }

    public Entrega actualizarEntrega(Entrega entrega) {
        return jpa.save(entrega);
    }

    public List<Entrega> listaCompleta() {
        return jpa.findAll();
    }

    public Entrega buscarPorId(int id) {
        return jpa.findById(id).orElse(null);
    }
}

package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Solicitude;
import co.edu.ue.jpa.ISolicitudeJpa;

@Repository
public class SolicitudeDao {

    @Autowired
    ISolicitudeJpa jpa;

    public List<Solicitude> guardarSolicitud(Solicitude solicitud) {
        jpa.save(solicitud);
        return listaCompleta();
    }

    public Solicitude actualizarSolicitud(Solicitude solicitud) {
        return jpa.save(solicitud);
    }

    public List<Solicitude> listaCompleta() {
        return jpa.findAll();
    }

    public Solicitude buscarPorId(int id) {
        return jpa.findById(id).orElse(null);
    }
}

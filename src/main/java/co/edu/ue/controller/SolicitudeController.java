package co.edu.ue.controller;

import co.edu.ue.entity.Solicitude;
import co.edu.ue.service.ISolicitudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudeController {

    @Autowired
    private ISolicitudeService solicitudeService;

    @GetMapping
    public List<Solicitude> listarTodos() {
        return solicitudeService.findAll();
    }

    @GetMapping("/{id}")
    public Solicitude buscarPorId(@PathVariable Long id) {
        return solicitudeService.findById(id);
    }

    @PostMapping
    public Solicitude crear(@RequestBody Solicitude solicitude) {
        return solicitudeService.save(solicitude);
    }

    @PutMapping("/{id}")
    public Solicitude actualizar(@RequestBody Solicitude solicitude, @PathVariable Long id) {
        Solicitude solicitudeExistente = solicitudeService.findById(id);
        if (solicitudeExistente != null) {
            solicitude.setId(id);
            return solicitudeService.save(solicitude);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        solicitudeService.delete(id);
    }
}

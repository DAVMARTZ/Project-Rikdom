package co.edu.ue.controller;

import co.edu.ue.entity.Entrega;
import co.edu.ue.service.IEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entregas")
public class EntregaController {

    @Autowired
    private IEntregaService entregaService;

    @GetMapping
    public List<Entrega> listarTodos() {
        return entregaService.findAll();
    }

    @GetMapping("/{id}")
    public Entrega buscarPorId(@PathVariable Long id) {
        return entregaService.findById(id);
    }

    @PostMapping
    public Entrega crear(@RequestBody Entrega entrega) {
        return entregaService.save(entrega);
    }

    @PutMapping("/{id}")
    public Entrega actualizar(@RequestBody Entrega entrega, @PathVariable Long id) {
        Entrega entregaExistente = entregaService.findById(id);
        if (entregaExistente != null) {
            entrega.setId(id);
            return entregaService.save(entrega);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        entregaService.delete(id);
    }
}

package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento50;
import com.example.webcontabilidad.Service.Elemento50Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento50")
public class Elemento50Controller {
    private final Elemento50Service elemento50Service;

    public Elemento50Controller(Elemento50Service elemento50Service) {
        this.elemento50Service = elemento50Service;
    }

    @GetMapping
    public List<Elemento50> listar() {
        return elemento50Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento50 buscarPorId(@PathVariable Long id) {
        return elemento50Service.findById(id);
    }

    @PostMapping
    public Elemento50 guardar(@RequestBody Elemento50 elemento50) {
        return elemento50Service.save(elemento50);
    }

    @PutMapping("/{id}")
    public Elemento50 actualizar(@PathVariable Long id, @RequestBody Elemento50 elemento50) {
        return elemento50Service.update(id, elemento50);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento50Service.delete(id);
        return "Elemento eliminado";
    }
}

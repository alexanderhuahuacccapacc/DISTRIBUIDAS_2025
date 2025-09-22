package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento69;
import com.example.webcontabilidad.Service.Elemento69Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento69")
public class Elemento69Controller {
    private final Elemento69Service elemento69Service;

    public Elemento69Controller(Elemento69Service elemento69Service) {
        this.elemento69Service = elemento69Service;
    }

    @GetMapping
    public List<Elemento69> listar() {
        return elemento69Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento69 buscarPorId(@PathVariable Long id) {
        return elemento69Service.findById(id);
    }

    @PostMapping
    public Elemento69 guardar(@RequestBody Elemento69 elemento69) {
        return elemento69Service.save(elemento69);
    }

    @PutMapping("/{id}")
    public Elemento69 actualizar(@PathVariable Long id, @RequestBody Elemento69 elemento69) {
        return elemento69Service.update(id, elemento69);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento69Service.delete(id);
        return "Elemento eliminado";
    }
}

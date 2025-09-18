package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento02;
import com.example.webcontabilidad.Service.Elemento02Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento02")


public class Elemento02Controller {
    private final Elemento02Service elemento02Service;

    public Elemento02Controller(Elemento02Service elemento02Service) {
        this.elemento02Service = elemento02Service;
    }

    @GetMapping
    public List<Elemento02> listar() {
        return elemento02Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento02 buscarPorId(@PathVariable Long id) {
        return elemento02Service.findById(id);
    }

    @PostMapping
    public Elemento02 guardar(@RequestBody Elemento02 elemento02) {
        return elemento02Service.save(elemento02);
    }

    @PutMapping("/{id}")
    public Elemento02 actualizar(@PathVariable Long id, @RequestBody Elemento02 elemento02) {
        return elemento02Service.update(id, elemento02);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento02Service.delete(id);
        return "Elemento eliminado";
    }
}

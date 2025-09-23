package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento42;
import com.example.webcontabilidad.Service.Elemento42Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento42")
public class Elemento42Controller {
    private final Elemento42Service elemento42Service;

    public Elemento42Controller(Elemento42Service elemento42Service) {
        this.elemento42Service = elemento42Service;
    }

    @GetMapping
    public List<Elemento42> listar() {
        return elemento42Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento42 buscarPorId(@PathVariable Long id) {
        return elemento42Service.findById(id);
    }

    @PostMapping
    public Elemento42 guardar(@RequestBody Elemento42 elemento42) {
        return elemento42Service.save(elemento42);
    }

    @PutMapping("/{id}")
    public Elemento42 actualizar(@PathVariable Long id, @RequestBody Elemento42 elemento42) {
        return elemento42Service.update(id, elemento42);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento42Service.delete(id);
        return "Elemento eliminado";
    }
}

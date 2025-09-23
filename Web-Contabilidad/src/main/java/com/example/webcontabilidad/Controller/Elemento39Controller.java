package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento39;

import com.example.webcontabilidad.Service.Elemento39Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento39")
public class Elemento39Controller {
    private final Elemento39Service elemento39Service;

    public Elemento39Controller(Elemento39Service elemento39Service) {
        this.elemento39Service = elemento39Service;
    }

    @GetMapping
    public List<Elemento39> listar() {
        return elemento39Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento39 buscarPorId(@PathVariable Long id) {
        return elemento39Service.findById(id);
    }

    @PostMapping
    public Elemento39 guardar(@RequestBody Elemento39 elemento39) {
        return elemento39Service.save(elemento39);
    }

    @PutMapping("/{id}")
    public Elemento39 actualizar(@PathVariable Long id, @RequestBody Elemento39 elemento39) {
        return elemento39Service.update(id, elemento39);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento39Service.delete(id);
        return "Elemento eliminado";
    }
}

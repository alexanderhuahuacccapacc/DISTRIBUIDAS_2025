package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento65;
import com.example.webcontabilidad.Service.Elemento65Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento65")
public class Elemento65Controller {
    private final Elemento65Service elemento65Service;

    public Elemento65Controller(Elemento65Service elemento65Service) {
        this.elemento65Service = elemento65Service;
    }

    @GetMapping
    public List<Elemento65> listar() {
        return elemento65Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento65 buscarPorId(@PathVariable Long id) {
        return elemento65Service.findById(id);
    }

    @PostMapping
    public Elemento65 guardar(@RequestBody Elemento65 elemento65) {
        return elemento65Service.save(elemento65);
    }

    @PutMapping("/{id}")
    public Elemento65 actualizar(@PathVariable Long id, @RequestBody Elemento65 elemento65) {
        return elemento65Service.update(id, elemento65);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento65Service.delete(id);
        return "Elemento eliminado";
    }
}

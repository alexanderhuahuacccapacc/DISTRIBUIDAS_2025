package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento16;
import com.example.webcontabilidad.Service.Elemento16Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento16")
public class Elemento16Controller {
    private final Elemento16Service elemento16Service;

    public Elemento16Controller(Elemento16Service elemento16Service) {
        this.elemento16Service = elemento16Service;
    }

    @GetMapping
    public List<Elemento16> listar() {
        return elemento16Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento16 buscarPorId(@PathVariable Long id) {
        return elemento16Service.findById(id);
    }

    @PostMapping
    public Elemento16 guardar(@RequestBody Elemento16 elemento16) {
        return elemento16Service.save(elemento16);
    }

    @PutMapping("/{id}")
    public Elemento16 actualizar(@PathVariable Long id, @RequestBody Elemento16 elemento16) {
        return elemento16Service.update(id, elemento16);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento16Service.delete(id);
        return "Elemento eliminado";
    }
}

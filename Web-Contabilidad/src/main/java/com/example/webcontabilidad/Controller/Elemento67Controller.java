package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento67;
import com.example.webcontabilidad.Service.Elemento67Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento67")
public class Elemento67Controller {
    private final Elemento67Service elemento67Service;

    public Elemento67Controller(Elemento67Service elemento67Service) {
        this.elemento67Service = elemento67Service;
    }

    @GetMapping
    public List<Elemento67> listar() {
        return elemento67Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento67 buscarPorId(@PathVariable Long id) {
        return elemento67Service.findById(id);
    }

    @PostMapping
    public Elemento67 guardar(@RequestBody Elemento67 elemento67) {
        return elemento67Service.save(elemento67);
    }

    @PutMapping("/{id}")
    public Elemento67 actualizar(@PathVariable Long id, @RequestBody Elemento67 elemento67) {
        return elemento67Service.update(id, elemento67);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento67Service.delete(id);
        return "Elemento eliminado";
    }
}

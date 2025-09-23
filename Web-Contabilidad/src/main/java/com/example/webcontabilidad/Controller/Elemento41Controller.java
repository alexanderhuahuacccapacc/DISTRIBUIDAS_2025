package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento41;
import com.example.webcontabilidad.Service.Elemento41Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento41")
public class Elemento41Controller {
    private final Elemento41Service elemento41Service;

    public Elemento41Controller(Elemento41Service elemento41Service) {
        this.elemento41Service = elemento41Service;
    }

    @GetMapping
    public List<Elemento41> listar() {
        return elemento41Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento41 buscarPorId(@PathVariable Long id) {
        return elemento41Service.findById(id);
    }

    @PostMapping
    public Elemento41 guardar(@RequestBody Elemento41 elemento41) {
        return elemento41Service.save(elemento41);
    }

    @PutMapping("/{id}")
    public Elemento41 actualizar(@PathVariable Long id, @RequestBody Elemento41 elemento41) {
        return elemento41Service.update(id, elemento41);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento41Service.delete(id);
        return "Elemento eliminado";
    }
}

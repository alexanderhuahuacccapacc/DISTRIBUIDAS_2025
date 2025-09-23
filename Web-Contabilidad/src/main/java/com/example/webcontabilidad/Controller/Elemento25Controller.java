package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento25;
import com.example.webcontabilidad.Service.Elemento25Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento25")
public class Elemento25Controller {
    private final Elemento25Service elemento25Service;

    public Elemento25Controller(Elemento25Service elemento25Service) {
        this.elemento25Service = elemento25Service;
    }

    @GetMapping
    public List<Elemento25> listar() {
        return elemento25Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento25 buscarPorId(@PathVariable Long id) {
        return elemento25Service.findById(id);
    }

    @PostMapping
    public Elemento25 guardar(@RequestBody Elemento25 elemento25) {
        return elemento25Service.save(elemento25);
    }

    @PutMapping("/{id}")
    public Elemento25 actualizar(@PathVariable Long id, @RequestBody Elemento25 elemento25) {
        return elemento25Service.update(id, elemento25);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento25Service.delete(id);
        return "Elemento eliminado";
    }
}

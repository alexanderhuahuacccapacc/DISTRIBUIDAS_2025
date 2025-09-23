package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento60;
import com.example.webcontabilidad.Service.Elemento60Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento60")
public class Elemento60Controller {
    private final Elemento60Service elemento60Service;

    public Elemento60Controller(Elemento60Service elemento60Service) {
        this.elemento60Service = elemento60Service;
    }

    @GetMapping
    public List<Elemento60> listar() {
        return elemento60Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento60 buscarPorId(@PathVariable Long id) {
        return elemento60Service.findById(id);
    }

    @PostMapping
    public Elemento60 guardar(@RequestBody Elemento60 elemento60) {
        return elemento60Service.save(elemento60);
    }

    @PutMapping("/{id}")
    public Elemento60 actualizar(@PathVariable Long id, @RequestBody Elemento60 elemento60) {
        return elemento60Service.update(id, elemento60);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento60Service.delete(id);
        return "Elemento eliminado";
    }
}

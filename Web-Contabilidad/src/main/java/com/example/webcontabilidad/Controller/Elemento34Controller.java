package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento34;
import com.example.webcontabilidad.Service.Elemento34Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento34")
public class Elemento34Controller {
    private final Elemento34Service elemento34Service;

    public Elemento34Controller(Elemento34Service elemento34Service) {
        this.elemento34Service = elemento34Service;
    }

    @GetMapping
    public List<Elemento34> listar() {
        return elemento34Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento34 buscarPorId(@PathVariable Long id) {
        return elemento34Service.findById(id);
    }

    @PostMapping
    public Elemento34 guardar(@RequestBody Elemento34 elemento34) {
        return elemento34Service.save(elemento34);
    }

    @PutMapping("/{id}")
    public Elemento34 actualizar(@PathVariable Long id, @RequestBody Elemento34 elemento34) {
        return elemento34Service.update(id, elemento34);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento34Service.delete(id);
        return "Elemento eliminado";
    }
}

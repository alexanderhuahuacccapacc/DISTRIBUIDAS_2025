package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento24;
import com.example.webcontabilidad.Service.Elemento24Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento24")
public class Elemento24Controller {
    private final Elemento24Service elemento24Service;

    public Elemento24Controller(Elemento24Service elemento24Service) {
        this.elemento24Service = elemento24Service;
    }

    @GetMapping
    public List<Elemento24> listar() {
        return elemento24Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento24 buscarPorId(@PathVariable Long id) {
        return elemento24Service.findById(id);
    }

    @PostMapping
    public Elemento24 guardar(@RequestBody Elemento24 elemento24) {
        return elemento24Service.save(elemento24);
    }

    @PutMapping("/{id}")
    public Elemento24 actualizar(@PathVariable Long id, @RequestBody Elemento24 elemento24) {
        return elemento24Service.update(id, elemento24);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento24Service.delete(id);
        return "Elemento eliminado";
    }
}

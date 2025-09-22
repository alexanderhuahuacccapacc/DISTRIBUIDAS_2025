package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento70;
import com.example.webcontabilidad.Service.Elemento70Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento70")
public class Elemento70Controller {
    private final Elemento70Service elemento70Service;

    public Elemento70Controller(Elemento70Service elemento70Service) {
        this.elemento70Service = elemento70Service;
    }

    @GetMapping
    public List<Elemento70> listar() {
        return elemento70Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento70 buscarPorId(@PathVariable Long id) {
        return elemento70Service.findById(id);
    }

    @PostMapping
    public Elemento70 guardar(@RequestBody Elemento70 elemento70) {
        return elemento70Service.save(elemento70);
    }

    @PutMapping("/{id}")
    public Elemento70 actualizar(@PathVariable Long id, @RequestBody Elemento70 elemento70) {
        return elemento70Service.update(id, elemento70);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento70Service.delete(id);
        return "Elemento eliminado";
    }
}

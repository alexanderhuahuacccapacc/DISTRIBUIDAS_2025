package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento33;

import com.example.webcontabilidad.Service.Elemento33Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento33")
public class Elemento33Controller {
    private final Elemento33Service elemento33Service;

    public Elemento33Controller(Elemento33Service elemento33Service) {
        this.elemento33Service = elemento33Service;
    }

    @GetMapping
    public List<Elemento33> listar() {
        return elemento33Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento33 buscarPorId(@PathVariable Long id) {
        return elemento33Service.findById(id);
    }

    @PostMapping
    public Elemento33 guardar(@RequestBody Elemento33 elemento33) {
        return elemento33Service.save(elemento33);
    }

    @PutMapping("/{id}")
    public Elemento33 actualizar(@PathVariable Long id, @RequestBody Elemento33 elemento33) {
        return elemento33Service.update(id, elemento33);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento33Service.delete(id);
        return "Elemento eliminado";
    }
}

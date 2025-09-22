package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento95;
import com.example.webcontabilidad.Service.Elemento95Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento95")
public class Elemento95Controller {
    private final Elemento95Service elemento95Service;

    public Elemento95Controller(Elemento95Service elemento95Service) {
        this.elemento95Service = elemento95Service;
    }

    @GetMapping
    public List<Elemento95> listar() {
        return elemento95Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento95 buscarPorId(@PathVariable Long id) {
        return elemento95Service.findById(id);
    }

    @PostMapping
    public Elemento95 guardar(@RequestBody Elemento95 elemento95) {
        return elemento95Service.save(elemento95);
    }

    @PutMapping("/{id}")
    public Elemento95 actualizar(@PathVariable Long id, @RequestBody Elemento95 elemento95) {
        return elemento95Service.update(id, elemento95);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento95Service.delete(id);
        return "Elemento eliminado";
    }
}

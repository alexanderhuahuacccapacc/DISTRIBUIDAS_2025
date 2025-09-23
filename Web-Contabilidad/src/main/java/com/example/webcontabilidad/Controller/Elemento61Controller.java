package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento61;
import com.example.webcontabilidad.Service.Elemento61Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento61")
public class Elemento61Controller {
    private final Elemento61Service elemento61Service;

    public Elemento61Controller(Elemento61Service elemento61Service) {
        this.elemento61Service = elemento61Service;
    }

    @GetMapping
    public List<Elemento61> listar() {
        return elemento61Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento61 buscarPorId(@PathVariable Long id) {
        return elemento61Service.findById(id);
    }

    @PostMapping
    public Elemento61 guardar(@RequestBody Elemento61 elemento14) {
        return elemento61Service.save(elemento14);
    }

    @PutMapping("/{id}")
    public Elemento61 actualizar(@PathVariable Long id, @RequestBody Elemento61 elemento61) {
        return elemento61Service.update(id, elemento61);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento61Service.delete(id);
        return "Elemento eliminado";
    }
}

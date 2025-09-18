package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento10;
import com.example.webcontabilidad.Service.Elemento10Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Elemento10")
public class Elemento10Controller {
    private final Elemento10Service elemento10Service;

    public Elemento10Controller(Elemento10Service elemento10Service) {
        this.elemento10Service = elemento10Service;
    }

    @GetMapping
    public List<Elemento10> listar() {
        return elemento10Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento10 buscarPorId(@PathVariable Long id) {
        return elemento10Service.findById(id);
    }

    @PostMapping
    public Elemento10 guardar(@RequestBody Elemento10 elemento10) {
        return elemento10Service.save(elemento10);
    }

    @PutMapping("/{id}")
    public Elemento10 actualizar(@PathVariable Long id, @RequestBody Elemento10 elemento10) {
        return elemento10Service.update(id, elemento10);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento10Service.delete(id);
        return "Elemento eliminado";
    }
}

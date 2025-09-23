package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento40;
import com.example.webcontabilidad.Service.Elemento40Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento40")
public class Elemento40Controller {
    private final Elemento40Service elemento40Service;

    public Elemento40Controller(Elemento40Service elemento14Service) {
        this.elemento40Service = elemento14Service;
    }

    @GetMapping
    public List<Elemento40> listar() {
        return elemento40Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento40 buscarPorId(@PathVariable Long id) {
        return elemento40Service.findById(id);
    }

    @PostMapping
    public Elemento40 guardar(@RequestBody Elemento40 elemento40) {
        return elemento40Service.save(elemento40);
    }

    @PutMapping("/{id}")
    public Elemento40 actualizar(@PathVariable Long id, @RequestBody Elemento40 elemento40) {
        return elemento40Service.update(id, elemento40);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento40Service.delete(id);
        return "Elemento eliminado";
    }
}

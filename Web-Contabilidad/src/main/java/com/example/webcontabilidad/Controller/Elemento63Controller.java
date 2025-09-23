package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento63;
import com.example.webcontabilidad.Service.Elemento63Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento63")
public class Elemento63Controller {
    private final Elemento63Service elemento63Service;

    public Elemento63Controller(Elemento63Service elemento63Service) {
        this.elemento63Service = elemento63Service;
    }

    @GetMapping
    public List<Elemento63> listar() {
        return elemento63Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento63 buscarPorId(@PathVariable Long id) {
        return elemento63Service.findById(id);
    }

    @PostMapping
    public Elemento63 guardar(@RequestBody Elemento63 elemento63) {
        return elemento63Service.save(elemento63);
    }

    @PutMapping("/{id}")
    public Elemento63 actualizar(@PathVariable Long id, @RequestBody Elemento63 elemento63) {
        return elemento63Service.update(id, elemento63);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento63Service.delete(id);
        return "Elemento eliminado";
    }
}

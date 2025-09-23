package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento51;
import com.example.webcontabilidad.Service.Elemento51Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento51")
public class Elemento51Controller {
    private final Elemento51Service elemento51Service;

    public Elemento51Controller(Elemento51Service elemento51Service) {
        this.elemento51Service = elemento51Service;
    }

    @GetMapping
    public List<Elemento51> listar() {
        return elemento51Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento51 buscarPorId(@PathVariable Long id) {
        return elemento51Service.findById(id);
    }

    @PostMapping
    public Elemento51 guardar(@RequestBody Elemento51 elemento51) {
        return elemento51Service.save(elemento51);
    }

    @PutMapping("/{id}")
    public Elemento51 actualizar(@PathVariable Long id, @RequestBody Elemento51 elemento51) {
        return elemento51Service.update(id, elemento51);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento51Service.delete(id);
        return "Elemento eliminado";
    }
}

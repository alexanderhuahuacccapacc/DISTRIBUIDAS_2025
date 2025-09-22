package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento79;
import com.example.webcontabilidad.Service.Elemento79Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento79")
public class Elemento79Controller {
    private final Elemento79Service elemento79Service;

    public Elemento79Controller(Elemento79Service elemento79Service) {
        this.elemento79Service = elemento79Service;
    }

    @GetMapping
    public List<Elemento79> listar() {
        return elemento79Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento79 buscarPorId(@PathVariable Long id) {
        return elemento79Service.findById(id);
    }

    @PostMapping
    public Elemento79 guardar(@RequestBody Elemento79 elemento14) {
        return elemento79Service.save(elemento14);
    }

    @PutMapping("/{id}")
    public Elemento79 actualizar(@PathVariable Long id, @RequestBody Elemento79 elemento14) {
        return elemento79Service.update(id, elemento14);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento79Service.delete(id);
        return "Elemento eliminado";
    }
}

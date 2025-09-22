package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento14;
import com.example.webcontabilidad.Service.Elemento14Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento10")
public class Elemento50Controller {
    private final Elemento14Service elemento14Service;

    public Elemento14Controller(Elemento14Service elemento14Service) {
        this.elemento14Service = elemento14Service;
    }

    @GetMapping
    public List<Elemento14> listar() {
        return elemento14Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento14 buscarPorId(@PathVariable Long id) {
        return elemento14Service.findById(id);
    }

    @PostMapping
    public Elemento14 guardar(@RequestBody Elemento14 elemento14) {
        return elemento14Service.save(elemento14);
    }

    @PutMapping("/{id}")
    public Elemento14 actualizar(@PathVariable Long id, @RequestBody Elemento14 elemento14) {
        return elemento14Service.update(id, elemento14);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento14Service.delete(id);
        return "Elemento eliminado";
    }
}

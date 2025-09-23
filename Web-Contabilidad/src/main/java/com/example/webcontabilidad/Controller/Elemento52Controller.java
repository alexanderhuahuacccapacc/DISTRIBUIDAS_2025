package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento14;
import com.example.webcontabilidad.Entity.Elemento52;
import com.example.webcontabilidad.Service.Elemento14Service;
import com.example.webcontabilidad.Service.Elemento52Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento52")
public class Elemento52Controller {
    private final Elemento52Service elemento52Service;

    public Elemento52Controller(Elemento52Service elemento52Service) {
        this.elemento52Service = elemento52Service;
    }

    @GetMapping
    public List<Elemento52> listar() {
        return elemento52Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento52 buscarPorId(@PathVariable Long id) {
        return elemento52Service.findById(id);
    }

    @PostMapping
    public Elemento52 guardar(@RequestBody Elemento52 elemento52) {
        return elemento52Service.save(elemento52);
    }

    @PutMapping("/{id}")
    public Elemento52 actualizar(@PathVariable Long id, @RequestBody Elemento52 elemento52) {
        return elemento52Service.update(id, elemento52);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento52Service.delete(id);
        return "Elemento eliminado";
    }
}

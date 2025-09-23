package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento64;
import com.example.webcontabilidad.Service.Elemento64Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento64")
public class Elemento64Controller {
    private final Elemento64Service elemento64Service;

    public Elemento64Controller(Elemento64Service elemento64Service) {
        this.elemento64Service = elemento64Service;
    }

    @GetMapping
    public List<Elemento64> listar() {
        return elemento64Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento64 buscarPorId(@PathVariable Long id) {
        return elemento64Service.findById(id);
    }

    @PostMapping
    public Elemento64 guardar(@RequestBody Elemento64 elemento14) {
        return elemento64Service.save(elemento14);
    }

    @PutMapping("/{id}")
    public Elemento64 actualizar(@PathVariable Long id, @RequestBody Elemento64 elemento64) {
        return elemento64Service.update(id, elemento64);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento64Service.delete(id);
        return "Elemento eliminado";
    }
}

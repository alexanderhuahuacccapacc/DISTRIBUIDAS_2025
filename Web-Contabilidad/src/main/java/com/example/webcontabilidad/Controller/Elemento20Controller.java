package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento20;
import com.example.webcontabilidad.Service.Elemento20Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento20")
public class Elemento20Controller {
    private final Elemento20Service elemento20Service;

    public Elemento20Controller(Elemento20Service elemento20Service) {
        this.elemento20Service = elemento20Service;
    }

    @GetMapping
    public List<Elemento20> listar() {
        return elemento20Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento20 buscarPorId(@PathVariable Long id) {
        return elemento20Service.findById(id);
    }

    @PostMapping
    public Elemento20 guardar(@RequestBody Elemento20 elemento20) {
        return elemento20Service.save(elemento20);
    }

    @PutMapping("/{id}")
    public Elemento20 actualizar(@PathVariable Long id, @RequestBody Elemento20 elemento20) {
        return elemento20Service.update(id, elemento20);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento20Service.delete(id);
        return "Elemento eliminado";
    }
}

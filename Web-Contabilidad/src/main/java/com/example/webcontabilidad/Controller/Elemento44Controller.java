package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento44;
import com.example.webcontabilidad.Service.Elemento44Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento44")
public class Elemento44Controller {
    private final Elemento44Service elemento44Service;

    public Elemento44Controller(Elemento44Service elemento44Service) {
        this.elemento44Service = elemento44Service;
    }

    @GetMapping
    public List<Elemento44> listar() {
        return elemento44Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento44 buscarPorId(@PathVariable Long id) {
        return elemento44Service.findById(id);
    }

    @PostMapping
    public Elemento44 guardar(@RequestBody Elemento44 elemento44) {
        return elemento44Service.save(elemento44);
    }

    @PutMapping("/{id}")
    public Elemento44 actualizar(@PathVariable Long id, @RequestBody Elemento44 elemento44) {
        return elemento44Service.update(id, elemento44);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento44Service.delete(id);
        return "Elemento eliminado";
    }
}

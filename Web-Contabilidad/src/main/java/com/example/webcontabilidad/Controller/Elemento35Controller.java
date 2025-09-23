package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento35;
import com.example.webcontabilidad.Service.Elemento35Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento35")
public class Elemento35Controller {
    private final Elemento35Service elemento35Service;

    public Elemento35Controller(Elemento35Service elemento35Service) {
        this.elemento35Service = elemento35Service;
    }

    @GetMapping
    public List<Elemento35> listar() {
        return elemento35Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento35 buscarPorId(@PathVariable Long id) {
        return elemento35Service.findById(id);
    }

    @PostMapping
    public Elemento35 guardar(@RequestBody Elemento35 elemento35) {
        return elemento35Service.save(elemento35);
    }

    @PutMapping("/{id}")
    public Elemento35 actualizar(@PathVariable Long id, @RequestBody Elemento35 elemento35) {
        return elemento35Service.update(id, elemento35);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento35Service.delete(id);
        return "Elemento eliminado";
    }
}

package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento46;
import com.example.webcontabilidad.Service.Elemento46Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento46")
public class Elemento46Controller {
    private final Elemento46Service elemento46Service;

    public Elemento46Controller(Elemento46Service elemento46Service) {
        this.elemento46Service = elemento46Service;
    }

    @GetMapping
    public List<Elemento46> listar() {
        return elemento46Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento46 buscarPorId(@PathVariable Long id) {
        return elemento46Service.findById(id);
    }

    @PostMapping
    public Elemento46 guardar(@RequestBody Elemento46 elemento46) {
        return elemento46Service.save(elemento46);
    }

    @PutMapping("/{id}")
    public Elemento46 actualizar(@PathVariable Long id, @RequestBody Elemento46 elemento46) {
        return elemento46Service.update(id, elemento46);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento46Service.delete(id);
        return "Elemento eliminado";
    }
}

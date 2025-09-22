package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento77;
import com.example.webcontabilidad.Service.Elemento77Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento77")
public class Elemento77Controller {
    private final Elemento77Service elemento77Service;

    public Elemento77Controller(Elemento77Service elemento77Service) {
        this.elemento77Service = elemento77Service;
    }

    @GetMapping
    public List<Elemento77> listar() {
        return elemento77Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento77 buscarPorId(@PathVariable Long id) {
        return elemento77Service.findById(id);
    }

    @PostMapping
    public Elemento77 guardar(@RequestBody Elemento77 elemento77) {
        return elemento77Service.save(elemento77);
    }

    @PutMapping("/{id}")
    public Elemento77 actualizar(@PathVariable Long id, @RequestBody Elemento77 elemento77) {
        return elemento77Service.update(id, elemento77);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento77Service.delete(id);
        return "Elemento eliminado";
    }
}

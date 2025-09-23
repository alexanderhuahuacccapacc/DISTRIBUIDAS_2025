package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento62;
import com.example.webcontabilidad.Service.Elemento62Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento62")
public class Elemento62Controller {
    private final Elemento62Service elemento62Service;

    public Elemento62Controller(Elemento62Service elemento62Service) {
        this.elemento62Service = elemento62Service;
    }

    @GetMapping
    public List<Elemento62> listar() {
        return elemento62Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento62 buscarPorId(@PathVariable Long id) {
        return elemento62Service.findById(id);
    }

    @PostMapping
    public Elemento62 guardar(@RequestBody Elemento62 elemento62) {
        return elemento62Service.save(elemento62);
    }

    @PutMapping("/{id}")
    public Elemento62 actualizar(@PathVariable Long id, @RequestBody Elemento62 elemento62) {
        return elemento62Service.update(id, elemento62);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento62Service.delete(id);
        return "Elemento eliminado";
    }
}

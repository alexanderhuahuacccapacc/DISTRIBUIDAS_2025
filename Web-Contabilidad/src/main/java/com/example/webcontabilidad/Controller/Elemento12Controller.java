package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento12;
import com.example.webcontabilidad.Service.Elemento12Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento12")
public class Elemento12Controller {
    private final Elemento12Service elemento12Service;

    public Elemento12Controller(Elemento12Service elemento12Service) {
        this.elemento12Service = elemento12Service;
    }

    @GetMapping
    public List<Elemento12> listar() {
        return elemento12Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento12 buscarPorId(@PathVariable Long id) {
        return elemento12Service.findById(id);
    }

    @PostMapping
    public Elemento12 guardar(@RequestBody Elemento12 elemento12) {
        return elemento12Service.save(elemento12);
    }

    @PutMapping("/{id}")
    public Elemento12 actualizar(@PathVariable Long id, @RequestBody Elemento12 elemento12) {
        return elemento12Service.update(id, elemento12);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento12Service.delete(id);
        return "Elemento eliminado";
    }
}

package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento14;
import com.example.webcontabilidad.Entity.Elemento94;
import com.example.webcontabilidad.Service.Elemento14Service;
import com.example.webcontabilidad.Service.Elemento94Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento94")
public class Elemento94Controller {
    private final Elemento94Service elemento94Service;

    public Elemento94Controller(Elemento94Service elemento94Service) {
        this.elemento94Service = elemento94Service;
    }

    @GetMapping
    public List<Elemento94> listar() {
        return elemento94Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento94 buscarPorId(@PathVariable Long id) {
        return elemento94Service.findById(id);
    }

    @PostMapping
    public Elemento94 guardar(@RequestBody Elemento94 elemento14) {
        return elemento94Service.save(elemento14);
    }

    @PutMapping("/{id}")
    public Elemento94 actualizar(@PathVariable Long id, @RequestBody Elemento94 elemento94) {
        return elemento94Service.update(id, elemento94);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento94Service.delete(id);
        return "Elemento eliminado";
    }
}

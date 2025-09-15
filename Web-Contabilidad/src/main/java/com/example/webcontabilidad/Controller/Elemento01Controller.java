package com.example.webcontabilidad.Controller;

import com.example.webcontabilidad.Entity.Elemento01;
import com.example.webcontabilidad.Service.ElementoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento01")
@RequiredArgsConstructor
public class Elemento01Controller {

    @Autowired
    private final ElementoService elementoService;

    @GetMapping
    public List<Elemento01> listar() {
        return elementoService.findAll();
    }

    @GetMapping("/{id}")
    public Elemento01 buscarPorId(@PathVariable Long id) {
        return elementoService.findById(id);
    }

    @PostMapping
    public Elemento01 guardar(@RequestBody Elemento01 elemento) {
        return elementoService.save(elemento);
    }

    @PutMapping("/{id}")
    public Elemento01 actualizar(@PathVariable Long id, @RequestBody Elemento01 elemento) {
        return elementoService.update(id, elemento);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elementoService.delete(id);
        return "Elemento eliminado";
    }
}

package com.example.webcontabilidad.Controller;


import com.example.webcontabilidad.Entity.Elemento26;
import com.example.webcontabilidad.Service.Elemento26Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Elemento26")
public class Elemento26Controller {
    private final Elemento26Service elemento26Service;

    public Elemento26Controller(Elemento26Service elemento26Service) {
        this.elemento26Service = elemento26Service;
    }

    @GetMapping
    public List<Elemento26> listar() {
        return elemento26Service.findAll();
    }

    @GetMapping("/{id}")
    public Elemento26 buscarPorId(@PathVariable Long id) {
        return elemento26Service.findById(id);
    }

    @PostMapping
    public Elemento26 guardar(@RequestBody Elemento26 elemento26) {
        return elemento26Service.save(elemento26);
    }

    @PutMapping("/{id}")
    public Elemento26 actualizar(@PathVariable Long id, @RequestBody Elemento26 elemento26) {
        return elemento26Service.update(id, elemento26);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        elemento26Service.delete(id);
        return "Elemento eliminado";
    }
}

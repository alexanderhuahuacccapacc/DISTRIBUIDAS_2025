package com.example.sm_marca.Controller;

import com.example.sm_marca.Entity.Marca;
import com.example.sm_marca.Service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/marca2")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/{id}")
    public Optional<Marca> buscarPorId(@PathVariable Integer id) {
        return marcaService.buscarPorId(id);
    }

    @PostMapping
    public Marca guardar(Marca marca) {
        return marcaService.guardar(marca);
    }

    @PutMapping
    public Marca actualizar(Marca marca) {
        return marcaService.actualizar(marca);
    }

    @DeleteMapping
    public String eliminar(@PathVariable Integer id) {
        marcaService.borrarPorId(id);
        return "Marca eliminada";
    }

}

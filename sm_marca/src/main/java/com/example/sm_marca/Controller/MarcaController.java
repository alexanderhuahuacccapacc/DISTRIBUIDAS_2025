package com.example.sm_marca.Controller;

import com.example.sm_marca.Dto.CategoriaDto;
import com.example.sm_marca.Dto.MarcaDto;
import com.example.sm_marca.Entity.Marca;
import com.example.sm_marca.Service.MarcaService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> listar() {
        return marcaService.listar();
    }


    @GetMapping("/{id}")
    public MarcaDto buscarPorId(@PathVariable Integer id) {
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

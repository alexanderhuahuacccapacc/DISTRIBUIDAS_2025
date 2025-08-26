package com.example.repuestos.Controller;


import com.example.repuestos.Entity.Repuesto;
import com.example.repuestos.Service.RepuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/repuesto")
public class RepuestoController {
    @Autowired
    private RepuestoService repuestoService ;

    @GetMapping
    public List<Repuesto> listar() {
        return repuestoService.listar();
    }


    @GetMapping("/{id}")
    public Optional<Repuesto> buscarPorId(@PathVariable Integer id) {
        return repuestoService.buscarPorId(id);
    }

    @PostMapping
    public Repuesto guardar(Repuesto marca) {
        return repuestoService.guardar(marca);
    }

    @PutMapping
    public Repuesto actualizar(Repuesto marca) {
        return repuestoService.actualizar(marca);
    }

    @DeleteMapping
    public String eliminar(@PathVariable Integer id) {
        repuestoService.borrarPorId(id);
        return "Marca eliminada";
    }
}

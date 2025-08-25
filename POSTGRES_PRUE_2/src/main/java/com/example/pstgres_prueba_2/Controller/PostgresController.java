package com.example.pstgres_prueba_2.Controller;

import com.example.pstgres_prueba_2.Entity.Postg;
import com.example.pstgres_prueba_2.Service.PostgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/postg")
public class PostgresController {

    @Autowired
    private PostgService postgService ;

    @GetMapping
    public List<Postg> listar() {
        return postgService.listar();
    }


    @GetMapping("/{id}")
    public Optional<Postg> buscarPorId(@PathVariable Integer id) {
        return postgService.buscarPorId(id);
    }

    @PostMapping
    public Postg guardar(Postg marca) {
        return postgService.guardar(marca);
    }

    @PutMapping
    public Postg actualizar(Postg marca) {
        return postgService.actualizar(marca);
    }

    @DeleteMapping
    public String eliminar(@PathVariable Integer id) {
        postgService.borrarPorId(id);
        return "Marca eliminada";
    }
}

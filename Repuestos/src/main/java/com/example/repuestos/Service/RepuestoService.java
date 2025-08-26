package com.example.repuestos.Service;

import com.example.repuestos.Entity.Repuesto;

import java.util.List;
import java.util.Optional;

public interface RepuestoService {
    List<Repuesto> listar();
    Optional<Repuesto> buscarPorId(Integer id);
    Repuesto guardar(Repuesto repuesto);
    Repuesto actualizar(Repuesto repuesto);
    void borrarPorId(Integer id);
}

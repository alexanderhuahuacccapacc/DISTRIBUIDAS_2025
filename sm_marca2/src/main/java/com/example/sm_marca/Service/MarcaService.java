package com.example.sm_marca.Service;

import com.example.sm_marca.Entity.Marca;

import java.util.List;
import java.util.Optional;

public interface MarcaService {
    List<Marca> listar();
    Optional<Marca> buscarPorId(Integer id);
    Marca guardar(Marca marca);
    Marca actualizar(Marca marca);
    void borrarPorId(Integer id);
}

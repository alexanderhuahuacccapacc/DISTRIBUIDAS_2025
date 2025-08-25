package com.example.pstgres_prueba_2.Service;

import com.example.pstgres_prueba_2.Entity.Postg;

import java.util.List;
import java.util.Optional;

public interface PostgService {
    List<Postg> listar();
    Optional<Postg> buscarPorId(Integer id);
    Postg guardar(Postg postg);
    Postg actualizar(Postg postg);
    void borrarPorId(Integer id);
}

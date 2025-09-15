package com.example.sm_marca.Service;

import com.example.sm_marca.Dto.MarcaDto;
import com.example.sm_marca.Entity.Marca;

import java.util.List;

public interface MarcaService {
    List<Marca> listar();
    MarcaDto buscarPorId(Integer id);
    Marca guardar(Marca marca);
    Marca actualizar(Marca marca);
    void borrarPorId(Integer id);
}

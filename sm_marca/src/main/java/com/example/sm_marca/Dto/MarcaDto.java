package com.example.sm_marca.Dto;

import lombok.Data;

@Data
public class MarcaDto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer idCategoria;
    private CategoriaDto catagoria;
    private MarcaDto2 marca2;
}

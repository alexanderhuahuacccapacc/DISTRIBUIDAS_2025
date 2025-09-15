package com.example.sm_marca.fegin;

import com.example.sm_marca.Dto.CategoriaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-catalogo", path = "/categoria")
public interface CatalogoFegin {
    @GetMapping("/{id}")
    public CategoriaDto buscarPorId(@PathVariable Integer id);
}

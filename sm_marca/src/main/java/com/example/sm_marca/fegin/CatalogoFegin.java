package com.example.sm_marca.fegin;

import com.example.sm_marca.Dto.CategoriaDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-catalogo", path = "/categoria")
public interface CatalogoFegin {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "categoriaListarPorIdCB", fallbackMethod = "fallbackCategoria")
    public CategoriaDto buscarPorId(@PathVariable Integer id);

    default CategoriaDto fallbackCategoria(Integer id, Exception e) {
        CategoriaDto categoriaDto = new CategoriaDto();
        categoriaDto.setId(9000000);
        categoriaDto.setNombre("No se pudo obtener la categoria");
        return categoriaDto;
    }
}


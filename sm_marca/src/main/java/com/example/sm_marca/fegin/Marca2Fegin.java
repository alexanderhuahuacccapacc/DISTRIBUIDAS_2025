package com.example.sm_marca.fegin;

import com.example.sm_marca.Dto.MarcaDto2;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sm-marca2", path = "/marca2")
public interface Marca2Fegin {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "marca2Listar2PorIdCB", fallbackMethod = "fallbackCategoria")
    public MarcaDto2 buscarPorId(@PathVariable Integer id);

    default MarcaDto2 fallbackCategoria(Integer id, Exception e) {
        MarcaDto2 marcaDto2 = new MarcaDto2();
        marcaDto2.setId(9000000);
        marcaDto2.setNombre("No se pudo obtener la marca2");
        return marcaDto2;
    }
}

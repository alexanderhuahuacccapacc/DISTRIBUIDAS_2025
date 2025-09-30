package com.example.sm_marca.fegin;

import com.example.sm_marca.Dto.PostDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "POSTGRES-PRUE-2", path = "/postg")
public interface PostFegin {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "postgresListarPorIdCB**", fallbackMethod = "fallbackPost")
    public PostDto buscarPorId(@PathVariable Integer id);

    default PostDto fallbackPost(Integer id, Exception e) {
        PostDto postDto = new PostDto();
        postDto.setId(9000000);
        postDto.setNombre("No se pudo obtener la postgres");
        return postDto;
    }
}

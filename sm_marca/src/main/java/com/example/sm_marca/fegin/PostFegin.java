package com.example.sm_marca.fegin;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "POSTGRES-PRUE-2", path = "/marca2")
public interface PostFegin {
}

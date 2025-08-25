package com.example.pstgres_prueba_2.Repository;

import com.example.pstgres_prueba_2.Entity.Postg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgRepository extends JpaRepository<Postg,Integer> {
}
